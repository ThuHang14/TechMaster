package com.example.demo.Controller;

import com.example.demo.Service.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class homeController {
        @GetMapping
    public String homePage(Model model){
            Book bookService = new Book("Nguyen Khuyen","chiec thuyen ngoai xa");
            model.addAttribute("book",bookService);
            model.addAttribute("testTh","<h1>Thu <span style='color:red'>Hang</span></h1>");
            model.addAttribute("testHTML","<h1>Thu <span style='color:red'>Hang</span></h1>");
            return "index";
        }
        @GetMapping("/text")
    public String homeText(Model model){
            return "text";
        }

    @GetMapping("/link")
    public String linkExpression(Model model) {
        model.addAttribute("dynamiclink", "products");
        return "link";
    }

    @GetMapping("/about")
    public String displayAbout(Model model){

        return "about";
    }
//        @RequestMapping("/json")
//        @GetMapping(value="/json" , produces = "application/json")
//        @ResponseBody //tra thang ve text
//        public BookService book(){
//            return new BookService("Nguyen Khuyen","chiec thuyen ngoai xa");
//        }
}
