package com.example.demo.exception;

import lombok.AllArgsConstructor;
import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public class ErrorMessage {
    private HttpStatus httpStatus;
    private String message;
}
