package com.example.demo.controller;

import com.example.demo.repo.EmployerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employer")
public class EmployerController {
    @Autowired
    private EmployerRepo emp;

    @GetMapping
    public String listAllEmployer(Model model){
        model.addAttribute("employers",emp.getAll());
        return "employers";
    }

}
