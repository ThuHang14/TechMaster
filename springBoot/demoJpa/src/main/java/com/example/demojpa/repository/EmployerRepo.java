package com.example.demojpa.repository;

import com.example.demojpa.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepo extends JpaRepository<Employer, Long> {
}
