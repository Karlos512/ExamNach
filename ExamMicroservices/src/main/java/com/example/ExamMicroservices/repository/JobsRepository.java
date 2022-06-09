package com.example.ExamMicroservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExamMicroservices.model.Jobs;

@Repository
public interface JobsRepository extends JpaRepository<Jobs,Long> {
    
}
