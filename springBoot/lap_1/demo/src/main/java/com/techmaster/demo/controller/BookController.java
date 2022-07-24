package com.techmaster.demo.controller;

import com.techmaster.demo.dto.BookRequest;
import com.techmaster.demo.model.Book;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

  private ConcurrentHashMap<String, Book> books;

  public BookController() {
    books = new ConcurrentHashMap<>();
    books.put("OX-13", new Book("OX-13", "Gone with the wind", "Cuong", 1945));
    books.put("OX-14", new Book("OX-14", "Chi Dau", "Nam Cao", 1943));
  }

  @GetMapping
  public List<Book> getBooks() {
    return books.values().stream().toList();
  }

  //   @GetMapping("/id")
  // public List<Book> getBooks(String id) {
  //   return books.values().stream().toList();
  // }

  @PostMapping
  public Book createNewBook(@RequestBody BookRequest bookRequest) {
    String uuid = UUID.randomUUID().toString();
    Book newBook = new Book(
      uuid,
      bookRequest.title(),
      bookRequest.author(),
      bookRequest.year()
    );
    books.put(uuid, newBook);
    return newBook;
  }

  @GetMapping(value = "/{id}")
  public Book getByID(@PathVariable("id") String id) {
    return books.get(id);
  }

  @PutMapping(value = "/{id}")
  public Book updateBookById(
    @PathVariable("id") String id,
    @RequestBody BookRequest bookRequest
  ) {
    Book updateBook = new Book(
      id,
      bookRequest.title(),
      bookRequest.author(),
      bookRequest.year()
    );
    books.replace(id, updateBook);
    return updateBook;
  }

  @DeleteMapping(value = "/{id}")
  public Book deleteBookById(@PathVariable("id") String id) {
    Book removedBook = books.remove(id);
    return removedBook;
  }
}

@RestController
@RequestMapping("/book")
public class BookController {

  private ConcurrentHashMap<String, Book> books;

  public BookController() {
    books = new ConcurrentHashMap<>();
    books.put("OX-13", new Book("OX-13", "Gone with the wind", "Cuong", 1945));
    books.put("OX-14", new Book("OX-14", "Chi Dau", "Nam Cao", 1943));
  }

  @GetMapping
  public List<Book> getBooks() {
    return books.values().stream().toList();
  }

  //   @GetMapping("/id")
  // public List<Book> getBooks(String id) {
  //   return books.values().stream().toList();
  // }

  @PostMapping
  public Book createNewBook(@RequestBody BookRequest bookRequest) {
    String uuid = UUID.randomUUID().toString();
    Book newBook = new Book(
      uuid,
      bookRequest.title(),
      bookRequest.author(),
      bookRequest.year()
    );
    books.put(uuid, newBook);
    return newBook;
  }

  @GetMapping(value = "/{id}")
  public Book getByID(@PathVariable("id") String id) {
    return books.get(id);
  }

  @PutMapping(value = "/{id}")
  public Book updateBookById(
    @PathVariable("id") String id,
    @RequestBody BookRequest bookRequest
  ) {
    Book updateBook = new Book(
      id,
      bookRequest.title(),
      bookRequest.author(),
      bookRequest.year()
    );
    books.replace(id, updateBook);
    return updateBook;
  }

  @DeleteMapping(value = "/{id}")
  public Book deleteBookById(@PathVariable("id") String id) {
    Book removedBook = books.remove(id);
    return removedBook;
  }
}
