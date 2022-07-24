package com.example.test32.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseDto {
    private Long id;

    private String name;

    private String slug;

    private String type;

    private String description;

    private String thumbnail;

}
