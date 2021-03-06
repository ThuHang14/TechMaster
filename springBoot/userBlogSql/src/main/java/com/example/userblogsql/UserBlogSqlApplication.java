package com.example.userblogsql;

import com.github.javafaker.Faker;
import com.github.slugify.Slugify;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class UserBlogSqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserBlogSqlApplication.class, args);
    }

    @Bean
    Faker faker() {
        return new Faker();
    }

    @Bean
    Slugify slugify() {
        return new Slugify();
    }

    @Bean
    Random random() {
        return new Random();}


    @Bean
        public ModelMapper modelMapper() {
            return new ModelMapper();
        }
}
