package com.example.test32.dto;

import lombok.*;

import javax.persistence.Column;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String avatar;
}
