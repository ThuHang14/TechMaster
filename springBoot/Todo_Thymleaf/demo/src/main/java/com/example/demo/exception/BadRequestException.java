package com.example.demo.exception;

public class BadRequestException extends RuntimeException{
  public BadRequestException(String message) { //ctr+o get message
	super(message);
  }
}
