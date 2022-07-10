package com.example.userblogsql;

import com.example.userblogsql.dto.BlogInfo;
import com.example.userblogsql.entity.Blog;
import com.example.userblogsql.entity.Category;
import com.example.userblogsql.repository.BlogRepository;
import com.example.userblogsql.repository.CategoryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class QueryTestAll {
    @Autowired
    private BlogRepository blogRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void get_all_infor_test() {
        List<BlogInfo> rs = blogRepository.getAllBlogInfo();
        rs.forEach(System.out::println);
    }


    @Test
    void getBlogAndComment() {
        List<Blog> bl = blogRepository.getAllBlog();
        bl.forEach(System.out::println);
    }
}
