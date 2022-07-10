package com.example.demojpa.controller;

import com.example.demojpa.model.Job;
import com.example.demojpa.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/job")
public class ControllerJob {
    @Autowired
    JobRepo repo;

    @GetMapping
    public List<Job> getAllJobs(){
        return repo.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<Job> getJobById(@PathVariable UUID id){
        return repo.findById(id);
    }
}
