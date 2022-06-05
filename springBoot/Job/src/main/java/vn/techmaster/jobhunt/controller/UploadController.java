package vn.techmaster.jobhunt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.techmaster.jobhunt.entity.Student;

import javax.servlet.ServletContext;
import java.nio.file.Path;

@Controller
public class UploadController {
    @Autowired
    ServletContext applicationContext;

    @PostMapping("/upload")
    public String uploadFile(@ModelAttribute Student student) {
        String path = applicationContext.getRealPath("/");
        try {
            student.getImageUrl();

            String filePath = path + "/" + student.getImageFile().getOriginalFilename();
            student.getImageFile().transferTo(Path.of(filePath));

            student.setImageFile(null);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }}
