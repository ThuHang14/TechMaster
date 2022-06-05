package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override //ctr + o
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") //public all API trong ung dung
                .allowedMethods("GET","PUT","POST","DELETE");//cho phep dung cac method
    }
}
