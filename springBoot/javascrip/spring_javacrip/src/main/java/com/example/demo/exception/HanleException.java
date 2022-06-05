package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HanleException {
  // bad request
public ErrorMessage handBadRequestException(BadRequestException e){
  return new ErrorMessage(HttpStatus.BAD_REQUEST,e.getMessage());
}
  //not found

  // error con lai

}
