package com.example.demospringdatajpa.controller;

import com.example.demospringdatajpa.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AuthorController {


    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/author/{id}")
    public String homeAuthor(Model model, @PathVariable Long id){
model.addAttribute("authors",authorRepository.getAuthorById(id));
        return "index";
    }
}
