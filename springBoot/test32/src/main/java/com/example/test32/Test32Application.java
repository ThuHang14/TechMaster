package com.example.test32;

import com.github.javafaker.Faker;
import com.github.slugify.Slugify;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class Test32Application {

    public static void main(String[] args) {
        SpringApplication.run(Test32Application.class, args);
    }

    @Bean
    public Faker faker(){
        return new Faker();
    }

    @Bean
    public Random random(){
        return new Random();
    }

    @Bean
    public Slugify slugify(){
        return new Slugify();
    }
}
