package com.example.demospringdatajpa.repository;

import com.example.demospringdatajpa.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>, CrudRepository<Author, Long>, PagingAndSortingRepository<Author, Long> {
    @Query(value = "select * from author a where a.name= ?1", nativeQuery = true)
    Author getAuthorsByName(String Name);

    @Modifying
    @Query(value = "update author set address= ?2 where id = ?1", nativeQuery = true)
    void updateAuthorAddressById(Long Id, String address);


    Author getAuthorById(Long id);

}