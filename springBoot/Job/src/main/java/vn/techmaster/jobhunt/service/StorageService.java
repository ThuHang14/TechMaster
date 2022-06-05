//package vn.techmaster.jobhunt.service;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//import vn.techmaster.jobhunt.exception.StorageException;
//
//import java.io.IOException;
//import java.lang.reflect.Field;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//
//@Service
//public class StorageService {
//    @Value("${upload.path}")
//    private String path;
//
//    public void uploadFile(MultipartFile file) {
//
//        if (file.isEmpty()) {
//            throw new StorageException("Failed to store empty file");
//        }
//
//        String fileName = file.getOriginalFilename();
//        try {
//            var is = file.getInputStream();
//            Files.copy(is, Paths.get(path + fileName), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            var msg = String.format("Failed to store file %s", fileName);
//            throw new StorageException(msg, e);
//        }
//    }
//}
