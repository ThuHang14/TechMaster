package com.example.userblogsql.controller;

import com.example.userblogsql.repository.CategoryRepository;
import com.example.userblogsql.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WebController {

    @Autowired
    BlogService blogService;

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/")
    public String getHomePage(Model model){
        model.addAttribute("blogs",blogService.getAllBlogInfo());
        model.addAttribute("blogsPopular",blogService.getBlogPopular(3));
       model.addAttribute("categories",categoryRepository.getCategoriesPopular(5));
        return "web/index";
    }

    @GetMapping("/blogs/{id}/{slug}")
    public String getDetailsPage(Model model, @PathVariable String id){
        model.addAttribute("blog",blogService.getBlogInfoById(id));
        return "web/detail";
    }

    @GetMapping("/about")
    public String getAboutPage(){
        return "web/about";
    }

    @GetMapping("/contact")
    public String getContactPage(){
        return "web/contact";
    }
}
