package com.example.userblogsql.repository;

import com.example.userblogsql.dto.UserDto;
import com.example.userblogsql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select new com.example.userblogsql.dto.UserDto(u.id, u.name, u.email, u.avatar) from User u where u.id = ?1")
    UserDto getUserDto(Integer id);

    <T> T getUserById(Integer id, Class<T> type);

}