package com.example.demologin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User {
    private String id;
    private String fullName;
    private String email;
    private String hashed_pass;
    private State state;
}
