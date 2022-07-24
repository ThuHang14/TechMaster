package com.example.demo.dto;

public record JobRequest(String title, String description, String location, int min_salary, int max_salary,
                         String email_to) {
}
