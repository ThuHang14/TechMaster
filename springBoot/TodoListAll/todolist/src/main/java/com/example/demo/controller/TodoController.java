package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.request.TodoRequest;
import com.example.demo.request.TodoUpdateRequest;
import com.example.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TodoController {
  @Autowired TodoService todoService;

  // lay danh sach cong viec
  @GetMapping("/todos")
  public List<Todo> getTodos(@RequestParam(required = false,defaultValue="") String status) {

    return todoService.getTodos(status);
  }

  // lay cong viec theo id
  @GetMapping("/todos/{id}")
  public Todo getTodoById(@PathVariable int id) {
    return todoService.getById(id);
  }

  // tao moi cong viec
  @PostMapping("/todos")
//  @ResponseStatus(HttpStatus.CREATED) // 201 // 200 : ok
  public ResponseEntity<Todo>  createTodo(@RequestBody TodoRequest request) { // ResponseEntity<?>
//    return todoService.createTodo(request);
    Todo todo = todoService.createTodo(request);
    return new ResponseEntity<>(todo , HttpStatus.CREATED);
  }

  // cap nhat cong viec
  @PutMapping("/todos/{id}")
  public Todo updateTodo(@PathVariable int id, @RequestBody TodoUpdateRequest request) {
    return todoService.updateTodo(id,request);
  }

  // xoa cong viec
  @DeleteMapping("/todos/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteTodo(@PathVariable int id) {
    todoService.deleteTodo(id);
  }
}
