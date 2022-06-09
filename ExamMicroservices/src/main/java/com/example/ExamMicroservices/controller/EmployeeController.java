package com.example.ExamMicroservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExamMicroservices.model.Employee;
import com.example.ExamMicroservices.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> listar(){
        return employeeService.ListEmployees();
    }

    @GetMapping
    public List<Employee> listarPorTrabajo(long id){
        return employeeService.ListEmployeesForJob(id);
    }

    @PostMapping
    public Employee Crear(@RequestBody Employee employee){
        return employeeService.NewEmployee(employee);
    }

    @PutMapping
    public Employee Actualiza(@RequestBody Employee employee){
        return employeeService.NewEmployee(employee);
    }
}
