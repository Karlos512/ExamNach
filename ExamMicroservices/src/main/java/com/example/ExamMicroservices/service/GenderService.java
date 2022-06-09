package com.example.ExamMicroservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ExamMicroservices.model.Genders;
import com.example.ExamMicroservices.repository.GenderRepository;

@Service
public class GenderService{
    
    @Autowired
    private GenderRepository genderRepository;

    public Genders NewGender(Genders gen){
       return genderRepository.save(gen);
    }

    public List<Genders> ListGenders(){
        return genderRepository.findAll();
    }

}
