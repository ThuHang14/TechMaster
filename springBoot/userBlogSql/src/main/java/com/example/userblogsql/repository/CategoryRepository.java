package com.example.userblogsql.repository;

import com.example.userblogsql.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query(nativeQuery = true,name = "getCategoriesPopular")
    List<Category> getCategoriesPopular(int limit);

    List<Category> findByIdIn(List<Integer> ids);


}