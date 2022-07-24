package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class JOB {
    private String id;
    private String title;
    private String description;
    private String location;
    private int min_salary;
    private int max_salary;
    private String email_to;
}
