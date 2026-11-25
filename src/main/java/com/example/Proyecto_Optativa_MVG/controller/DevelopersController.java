package com.example.Proyecto_Optativa_MVG.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto_Optativa_MVG.controller.converter.DevelopersConverter;
import com.example.Proyecto_Optativa_MVG.controller.dto.DevelopersDto;
import com.example.Proyecto_Optativa_MVG.persistence.model.Developers;
import com.example.Proyecto_Optativa_MVG.service.DevelopersService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@CrossOrigin 
@AllArgsConstructor 
@RequestMapping ("/api/v1/developers")
public class DevelopersController {

    DevelopersConverter developersConverter;

    DevelopersService developersService;

   @PostMapping
    public ResponseEntity<DevelopersDto> createDevelopers(@RequestBody DevelopersDto developersDto) {

    Developers developer = developersConverter.convertToEntity(developersDto);

    Developers savedDeveloper = developersService.createDevelopers(developer);

    return ResponseEntity.status(HttpStatus.CREATED).body(developersConverter.convertToDto(savedDeveloper));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {

    developersService.deleteDevelopers(id);

    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }   
    
    


    
}
