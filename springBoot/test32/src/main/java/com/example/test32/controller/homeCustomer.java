package com.example.test32.controller;

import com.example.test32.repository.TopicRepository;
import com.example.test32.service.CourseService;
import com.example.test32.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class homeCustomer {
    @Autowired
    private CourseService courseService;
    @Autowired
    private TopicService topicService;


    @GetMapping("/")
    public String getAllCourse(Model model,
                               @RequestParam(required = false, defaultValue = "") String topic,
                               @RequestParam(required = false, defaultValue = "") String name){
        model.addAttribute("courses",courseService.getAllCourse(name,topic));
        model.addAttribute("topics",topicService.getAllTopics());
        return "template-course/course-list";
    }

    @GetMapping("/khoa-hoc/onlab")
    public String getAllCourseOnlab(Model model,@RequestParam(required = false, defaultValue = "") String topic,
                                    @RequestParam(required = false, defaultValue = "") String name){
        model.addAttribute("courses",courseService.getAllCourseOnlab(name,topic));
        model.addAttribute("topics",topicService.getAllTopics());

        return "template-course/course-onlab-list";
    }

    @GetMapping("/khoa-hoc/online")
    public String getAllCourseOnline(Model model,@RequestParam(required = false, defaultValue = "") String topic,
                                     @RequestParam(required = false, defaultValue = "") String name){
        model.addAttribute("courses",courseService.getAllCourseOnline(name,topic));
        model.addAttribute("topics",topicService.getAllTopics());

        return "template-course/course-online-list";
    }

    @GetMapping("/khoa-hoc/{id}/{slug}")
    public String detailCourse (@PathVariable Long id,@PathVariable String slug,Model model){
        model.addAttribute("course",courseService.findCourseById(id));
        return "template-course/detail";
    }


}
