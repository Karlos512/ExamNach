package com.example.ExamMicroservices.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExamMicroservices.model.Employee_Worked_Hours;
import com.example.ExamMicroservices.repository.EmployeeWorkedRepository;

@Service
public class HoursWorkedService {
    
    @Autowired
    private EmployeeWorkedRepository employeeWorkedRepository;

    public Employee_Worked_Hours NewHoursWorked(Employee_Worked_Hours hw){
        return employeeWorkedRepository.save(hw);
    }

    public List<Employee_Worked_Hours> ListHoursWorked(){
        return employeeWorkedRepository.findAll();
    }

    public List<Employee_Worked_Hours> ListForEmployee(Date start, Date finish, long id){
        return employeeWorkedRepository.findByEmployee_idAndWorked_DateBetween(start, finish, id);
    }
}
