package com.example.test32.repository;

import com.example.test32.dto.CourseDto;
import com.example.test32.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query("select new com.example.test32.dto.CourseDto(id,name,slug,type,description,thumbnail) from Course ")
    List<CourseDto> getAllCourseDto();

    @Query("select new com.example.test32.dto.CourseDto(id,name,slug,type,description,thumbnail) from Course where type = :type")
    List<CourseDto> getAllCourseDto(@Param("type") String type);

    List<Course> getCoursesByType(String type);
    public Course getCourseById(Long id);

    List<Course> getByTopics_Name(String name);

    List<Course> getCoursesByNameContainingIgnoreCase(String name);
}