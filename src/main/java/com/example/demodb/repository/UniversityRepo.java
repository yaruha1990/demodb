package com.example.demodb.repository;

import com.example.demodb.domain.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepo extends JpaRepository<University, Long> {

}
