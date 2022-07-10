package com.example.userblogsql.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

@Getter
@Setter
@ToString
public class BlogInfo {

    private String id;
    private String title;
    private String slug;
    private String description;
    private String content;

    private String thumbnail;
    private String publishedAt;
    private Integer countComment;
    private AuthorInfo authorInfo;

    public BlogInfo(String id, String title, String slug, String description,String content, String thumbnail, String publishedAt, Integer countComment, String authorInfor) {
        this.id = id;
        this.title = title;
        this.slug = slug;
        this.description = description;
        this.content = content;
        this.thumbnail = thumbnail;
        this.publishedAt = publishedAt;
        this.countComment = countComment;

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            this.authorInfo = objectMapper.readValue(authorInfor, AuthorInfo.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class AuthorInfo {
    private String id;
    private String name;
}

