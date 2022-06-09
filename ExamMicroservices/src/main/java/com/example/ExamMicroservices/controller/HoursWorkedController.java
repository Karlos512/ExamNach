package com.example.ExamMicroservices.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ExamMicroservices.model.Employee_Worked_Hours;
import com.example.ExamMicroservices.service.HoursWorkedService;

@RestController
@RequestMapping("/HoursWorked")
public class HoursWorkedController {
    
    @Autowired
    private HoursWorkedService hoursWorkedService;

    @GetMapping
    public List<Employee_Worked_Hours> Listar(){
        return hoursWorkedService.ListHoursWorked();
    }

    @GetMapping
    public List<Employee_Worked_Hours> ListarPorEmpleado(Date start, Date finish, Long id){
        return hoursWorkedService.ListForEmployee(start, finish, id);
    }

    @PostMapping
    public Employee_Worked_Hours Crear(@RequestBody Employee_Worked_Hours hw){
        return hoursWorkedService.NewHoursWorked(hw);
    }

    @PutMapping
    public Employee_Worked_Hours Actualizar(@RequestBody Employee_Worked_Hours hw){
        return hoursWorkedService.NewHoursWorked(hw);
    }
}
