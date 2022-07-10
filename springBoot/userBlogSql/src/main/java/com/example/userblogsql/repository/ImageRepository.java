package com.example.userblogsql.repository;

import com.example.userblogsql.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository

public interface ImageRepository extends JpaRepository<Image, UUID>{
    List<Image> getImagesByUserId(Integer id);
}