package com.example.demouserjpa.repository;

import com.example.demouserjpa.dto.UserDto;
import com.example.demouserjpa.entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String username);

    List<User> getUsersByNameContainingIgnoreCase(String name);

    List<User> findByEmailStartsWithIgnoreCase(String email);

    List<User> findByNameLikeIgnoreCaseAllIgnoreCase(String name);

    Long countByName(String name);

    List<User> findByOrderByNameAsc(Pageable pageable);
    List<User> findByOrderByNameDesc(Sort sort);

    @Query("select count(u) from User u where upper(u.name) like upper(concat('%', :name, '%'))")
    long countByNameContainsIgnoreCase(@Param("name") String name);

    @Query("select u from User u where upper(u.email) = upper(?1)")
    List<User> findEmailEndWith(String email);

//    dto
    UserDto findByEmail(String email);
}