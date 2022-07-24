package com.example.demospringdatajpa;

import com.example.demospringdatajpa.entity.Author;
import com.example.demospringdatajpa.entity.Book;
import com.example.demospringdatajpa.repository.AuthorRepository;
import com.example.demospringdatajpa.repository.BookRepository;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Random;

@SpringBootTest
public class InitData {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private HttpServletRequest httpServletRequest;
    @Autowired
    private Faker faker;
    @Autowired
    private Random random;


    @Test
    void initDataAuthor() {
        for (int i = 0; i < 30; i++) {
            Author author = Author.builder()
                    .name(faker.name().fullName())
                    .address(faker.address().streetAddress())
                    .build();

            authorRepository.save(author);
        }
    }

    @Test
    void initDataBook() {
        List<Author> authorList = authorRepository.findAll();

        for (int i = 0; i < 50; i++) {
            Author authorRd = authorRepository.getAuthorById(random.nextLong(authorList.size()));
            Book book = Book.builder()
                    .name(faker.lorem().sentence(20))
                    .author_id(authorRd)
                    .build();

            bookRepository.save(book);
        }
    }
}
