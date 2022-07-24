package com.example.demospringdatajpa.repository;

import com.example.demospringdatajpa.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>, CrudRepository<Book, Long>, PagingAndSortingRepository<Book, Long> {
    @Modifying
    @Query(value = "delete from book b where b.id= ?1", nativeQuery = true)
    void deleteAuthorById(Long id);

    @Query(value = "select * from book b where b.id= ?1",
            countQuery = "select b.id b.name from book b where b.author_id= ?1",
            nativeQuery = true)
    Page<Book> getBooksByIdAuthor(Long id, Pageable page);
}