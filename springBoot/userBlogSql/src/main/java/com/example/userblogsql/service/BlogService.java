package com.example.userblogsql.service;

import com.example.userblogsql.dto.BlogInfo;
import com.example.userblogsql.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BlogService {

    @Autowired
    BlogRepository blogRepository;

    public List<BlogInfo> getAllBlogInfo() {
        return blogRepository.getAllBlogInfo();
    }

    public List<BlogInfo> getBlogPopular(int limit){
        return blogRepository.getAllBlogInfo().stream()
                .sorted((a,b) -> b.getCountComment() - a.getCountComment())
                .limit(limit)
                .collect(Collectors.toList());
    }

    public BlogInfo getBlogInfoById(String id){
        Optional<BlogInfo> blogInfoOptional =  blogRepository.getAllBlogInfo()
                .stream()
                .filter(blog -> blog.getId().equals(id))
                .findFirst();

        return blogInfoOptional.orElseThrow(null);

    };
}
