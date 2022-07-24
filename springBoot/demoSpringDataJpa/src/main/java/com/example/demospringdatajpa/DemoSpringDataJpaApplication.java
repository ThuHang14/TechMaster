package com.example.demospringdatajpa;

import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class DemoSpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringDataJpaApplication.class, args);
    }

    @Bean
    public Faker faker() {
        return new Faker();
    }

    @Bean
    public Random random(){
        return new Random();
    }

}
