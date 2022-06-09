package com.example.ExamMicroservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExamMicroservices.model.Jobs;
import com.example.ExamMicroservices.service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobsController {
    
    @Autowired
    private JobService jobService;

    @GetMapping
    public List<Jobs> listar(){
        return jobService.ListJobs();
    }

    @PostMapping
    public Jobs Crear(@RequestBody Jobs job){
        return jobService.NewJob(job);
    }

    @PutMapping
    public Jobs Actualizar(@RequestBody Jobs job){
        return jobService.NewJob(job);
    }

}
