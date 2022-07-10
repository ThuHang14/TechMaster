package com.example.demo.service;

import com.example.demo.exception.BadRequestException;
import com.example.demo.ultil.Ultils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileService {
    private final Path rootPath = Paths.get("uploads");

    public FileService() {
        createFolder(rootPath.toString());
    }

    //tao folder
    public void createFolder(String path) {
        File folder = new File(path);
        if ((!folder.exists())) {
            folder.mkdirs(); //tao file
        }
    }

    //upload file
    public String uploadFile(int id, MultipartFile file) {
        //tao folder tu id
        Path userDir = Paths.get("uploads").resolve(String.valueOf(id));
        createFolder(userDir.toString());

        //validate file
        validate(file);

        //tao path - fileUpload
        String generateFileId = String.valueOf(Instant.now().getEpochSecond());
        File fileService = new File(userDir + "/" + generateFileId);

        //up file
        try {

            //dung buffer de luu du lieu tu file
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(fileService));
            stream.write(file.getBytes());
            stream.close();

            return "/api/v1/users/" + id + "/files/" + generateFileId;


        } catch (Exception e) {
            throw new RuntimeException("loi upload file");
        }

    }

    public void validate(MultipartFile file) {
        //ktra ten file
        String fileName = file.getOriginalFilename();
        if (fileName == null || file.equals("")) {
            throw new BadRequestException("ten file khong hop le");
        }

        //ktra duoi file
        String fileExtension = Ultils.getExtensionFile(fileName);
        if (!Ultils.checkFileExtension(fileExtension)) {
            throw new BadRequestException("file khong hop le");
        }

        //ktra size(duoi 2mb)
        if ((double) file.getSize() / 1_000_000L > 2) {
            throw new BadRequestException("file khong duoc vuot 2MB");
        }


    }

    //xem file
    public byte[] readFile(int id,String fileId) {
        //lay duong dan
        Path usersPath = rootPath.resolve(String.valueOf(id));

        //ktra co ton tai khong
        if(!Files.exists(usersPath)){
            throw new RuntimeException("loi khi doc file "+ fileId);
        }

        try {

            Path file = usersPath.resolve(fileId);
            Resource resource = new UrlResource(file.toUri());

            if(resource.exists() || resource.isReadable()){
                return StreamUtils.copyToByteArray(resource.getInputStream());
            }else {
                throw new RuntimeException("loi khi doc file "+ fileId);
            }
        } catch (Exception e) {
            throw new RuntimeException("loi khi doc file "+ fileId);
        }
    }

    public void deleteFile(int id , String fileId){
        //lay duong dan
        Path usersPath = rootPath.resolve(String.valueOf(id));

        //ktra co ton tai khong
        if(!Files.exists(usersPath)){
            throw new RuntimeException("loi khi doc file "+ fileId);
        }

        Path file = usersPath.resolve(fileId);

        if(!file.toFile().exists()){
            throw new RuntimeException("file "+ fileId + " khong ton tai");
        }

        file.toFile().delete();
    }

    //lay file

    public List<String> getFileList(int id) {
        //lay duong dan
        Path usersPath = rootPath.resolve(String.valueOf(id));

        //ktra co ton tai khong
        if(!Files.exists(usersPath)){
            return new ArrayList<>();
        }

        //lay ds file cua user
       File[] files = usersPath.toFile().listFiles();

        return Arrays.stream(files).map(File::getName) //file -> file.getName()
                .sorted(Comparator.reverseOrder())
                .map(file -> "/api/v1/users/" +id + "/files/" + file)
                .collect(Collectors.toList());
    }
}
