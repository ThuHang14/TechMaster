package com.example.demospringdatajpa;

import com.example.demospringdatajpa.entity.Author;
import com.example.demospringdatajpa.repository.AuthorRepository;
import com.example.demospringdatajpa.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class TestQueries {


    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;

    @Test
    void getAuthorByName() {
        Author author = authorRepository.getAuthorsByName("Abel Sipes");
        System.out.println(author);
    }

    @Transactional
    @Test
    void updateAuthorAddressById() {
        authorRepository.updateAuthorAddressById(2L, "123 To Huu");
    }

    @Transactional
    @Test
    void deleteBookById() {
        bookRepository.deleteAuthorById(2L);
    }

    @Transactional
    @Test
    void getBookPageById() {
        Pageable pageable = PageRequest.of(0, 2);
        bookRepository.getBooksByIdAuthor(8L, pageable);
    }
}
