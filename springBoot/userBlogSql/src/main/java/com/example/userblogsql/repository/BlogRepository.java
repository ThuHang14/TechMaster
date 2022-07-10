package com.example.userblogsql.repository;

import com.example.userblogsql.dto.BlogInfo;
import com.example.userblogsql.entity.Blog;
import com.example.userblogsql.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, String> {
    @Query(name = "getAllBlogInfo", nativeQuery=true)
    List<BlogInfo> getAllBlogInfo();

    @Query(name = "getAllBlogAndComment", nativeQuery=true)
    List<Blog> getAllBlog();
}