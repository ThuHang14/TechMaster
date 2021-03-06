package com.example.userblogsql.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateBlogRequest {
    private String title;
    private String description;
    private String content;
    private String thumbnail;
    private int status;
    private List<Integer> categories;
}
