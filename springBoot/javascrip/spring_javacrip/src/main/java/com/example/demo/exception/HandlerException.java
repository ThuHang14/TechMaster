package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerException {
  // bad request
  @ExceptionHandler(BadRequestException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ErrorMessage handBadRequestException(BadRequestException e) {
    return new ErrorMessage(HttpStatus.BAD_REQUEST, e.getMessage());
  }
  // not found
  @ExceptionHandler(NotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ErrorMessage handNotFoundException(BadRequestException e) {
    return new ErrorMessage(HttpStatus.NOT_FOUND, e.getMessage());
  }
  // error other
  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public ErrorMessage handOtherException(Exception e) {
    return new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
  }
}
