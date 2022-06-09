package com.example.ExamMicroservices.repository;

import com.example.ExamMicroservices.model.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {   
    List<Employee> findByJob_id(long job_id);
}
