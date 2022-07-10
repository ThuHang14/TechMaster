package com.example.demo.service;

import com.example.demo.exception.NotFoundException;
import com.example.demo.model.Todo;
import com.example.demo.request.TodoRequest;
import com.example.demo.request.TodoUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class TodoService {
  private List<Todo> todos;

  public TodoService(){
	Random random = new Random();
	todos = new ArrayList<>();

	todos.add(new Todo(random.nextInt(100),"lam bai tap1",true));
	todos.add(new Todo(random.nextInt(100),"lam bai tap2",false));
	todos.add(new Todo(random.nextInt(100),"lam bai tap3",false));
	todos.add(new Todo(random.nextInt(100),"lam bai tap4",true));
  }

  public List<Todo> getTodos(String status){
	return switch(status){
	  case "true" -> todos.stream().filter(Todo::isStatus).collect(Collectors.toList());
	  case "false" -> todos.stream().filter(todo -> !todo.isStatus()).collect(Collectors.toList());
	  default ->  todos;
	};
  }

// helper method : tim kiem 1 todo theo id
  public Optional<Todo> findById(int id){
	return todos.stream().filter(todo -> todo.getId() == id).findFirst();
  }

  public Todo getById(int id){
	Optional<Todo> todoOptional = findById(id);
//	if(todoOptional.isPresent()){
//	 return todoOptional.get();
//	}
//	throw new NotFoundException("khong tim thay cong viec co id = " + id );
//	}
	return todoOptional.orElseThrow(() -> {
	  throw new NotFoundException("khong tim thay cong viec co id = " + id );
	});
  }

  public Todo createTodo(TodoRequest request){
	//valid title neu trong
	Random random = new Random();
	Todo todo = new Todo(random.nextInt(100),request.getTitle(), false);
	todos.add(todo);
	return todo;
  }

  public Todo updateTodo(int id , TodoUpdateRequest request){
//	Optional<Todo> todoOptional = findById(id);
//		if(todoOptional.isEmpty()){
//		  throw new NotFoundException("khong tim thay cong viec co id = " + id );
//
   		Todo todo = getById(id);
		todo.setTitle(request.getTitle());
		todo.setStatus(request.isStatus());

		return todo;
	}

	public void deleteTodo(int id){
	Todo todo = getById(id);
	todos.removeIf(t -> t.getId() == todo.getId());
	}


}
