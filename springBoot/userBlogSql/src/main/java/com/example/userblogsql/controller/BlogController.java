package com.example.userblogsql.controller;

import com.example.userblogsql.entity.Blog;
import com.example.userblogsql.repository.BlogRepository;
import com.example.userblogsql.repository.CategoryRepository;
import com.example.userblogsql.request.CreateBlogRequest;
import com.example.userblogsql.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;


    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private BlogRepository blogRepository;

    // Danh sách tất cả bài viết
    @GetMapping("/admin/blogs")
    public String getBlogPage(Model model) {
        // TODO : Bổ sung thêm phân trang
        model.addAttribute("blogs", blogService.getAllBlogDto());

        return "admin/blog/blog-index";
    }

    // Danh sách bài viết của tôi
    @GetMapping("/admin/blogs/own-blogs")
    public String getOwnBlogPage(Model model) {
        // TODO : Về sau userId sẽ là id của user đang đăng nhập
        Integer userId = 1;

        model.addAttribute("blogs", blogService.getAllBlogDtoByUserId(userId));

        return "admin/blog/blog-yourself";
    }

    // Tạo bài viết
    @GetMapping("/admin/blogs/create")
    public String getBlogCreatePage(Model model) {
        model.addAttribute("categories", categoryRepository.findAll());
        return "admin/blog/blog-create";
    }

    // Chi tiết bài viết
    @GetMapping("/admin/blogs/{id}/detail")
    public String getBlogDetailPage(@PathVariable String id, Model model) {
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("blog", blogService.getBlogById(id));
        return "admin/blog/blog-detail";
    }

    //    new blog
    @PostMapping("api/admin/blogs")
    public ResponseEntity<?> createBlog(@RequestBody CreateBlogRequest request) {
        Integer userId = 1;
        Blog blog = blogService.createBlog(userId, request);
        return new ResponseEntity<>(blog, HttpStatus.CREATED);
    }
//delete
    @DeleteMapping("api/admin/blogs/{id}")
    public void deleteBlog(@PathVariable String id) {
       blogService.deleteBlog(id);
    }


}
