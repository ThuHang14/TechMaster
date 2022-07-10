package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserViewController {
    @Autowired UserService service;

    @GetMapping("/")
    public String getUserPage(Model model){
        model.addAttribute("users",service.getUsers());
        return "index";
    }

    @GetMapping("/create")
    public String createUserPage(){
        return "create";
    }

    @GetMapping("detail/{id}")
    public String detailUserPage(@PathVariable int id, Model model){
        model.addAttribute("user",service.getUserById(id));
       model.addAttribute("images",service.getFileList(id));
        return "detail";
    }
}
