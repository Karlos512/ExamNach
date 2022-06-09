package com.example.ExamMicroservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExamMicroservices.model.Employee;
import com.example.ExamMicroservices.repository.EmployeeRepository;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee NewEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> ListEmployees(){
        return employeeRepository.findAll();
    }

    public List<Employee> ListEmployeesForJob(Long job_id){
        return employeeRepository.findByJob_id(job_id);
    }    

}
