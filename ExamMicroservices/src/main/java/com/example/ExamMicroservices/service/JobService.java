package com.example.ExamMicroservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExamMicroservices.model.Jobs;
import com.example.ExamMicroservices.repository.JobsRepository;

@Service
public class JobService {
    
    @Autowired
    private JobsRepository jobsRepository;

    public Jobs NewJob(Jobs job){
        return jobsRepository.save(job);
    }

    public List<Jobs> ListJobs(){
        return jobsRepository.findAll();
    }
    
}
