package vn.techmaster.jobhunt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private MultipartFile imageFile;
    private String imageUrl;
}
