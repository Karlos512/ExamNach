package com.example.ExamMicroservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ExamMicroservices.model.Genders;
import com.example.ExamMicroservices.service.GenderService;

@RestController
@RequestMapping("Genders")
public class GendersController {
    
    @Autowired
    private GenderService genderService;

    @GetMapping
    public List<Genders> Listar(){
        return genderService.ListGenders();
    }

    @PostMapping
    public Genders Crear(@RequestBody Genders genders){
        return genderService.NewGender(genders);
    }

    @PutMapping
    public Genders Actualizar(@RequestBody Genders genders){
        return genderService.NewGender(genders);
    }
}
