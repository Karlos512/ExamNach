package com.example.ExamMicroservices.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExamMicroservices.model.Employee_Worked_Hours;

@Repository
public interface EmployeeWorkedRepository extends JpaRepository<Employee_Worked_Hours, Long> {
    List<Employee_Worked_Hours> findByEmployee_idAndWorked_DateBetween(Date start, Date finish, long id);   
}
