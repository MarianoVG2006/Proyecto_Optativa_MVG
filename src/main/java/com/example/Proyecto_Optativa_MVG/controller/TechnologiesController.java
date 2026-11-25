package com.example.Proyecto_Optativa_MVG.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto_Optativa_MVG.controller.converter.TechnologiesConverter;
import com.example.Proyecto_Optativa_MVG.controller.dto.TechnologiesDto;
import com.example.Proyecto_Optativa_MVG.persistence.model.Technologies;
import com.example.Proyecto_Optativa_MVG.service.TechnologiesService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@CrossOrigin 
@AllArgsConstructor 
@RequestMapping ("/api/v1")
public class TechnologiesController {
    
    TechnologiesConverter technologiesConverter;

    TechnologiesService technologiesService;

    @PostMapping
    public ResponseEntity<TechnologiesDto> createTechnologies(@RequestBody TechnologiesDto technologiesDto) {

        Technologies technologies = technologiesConverter.convertToEntity(technologiesDto);

        Technologies savedTechnologies = technologiesService.createTechnologies(technologies);

        return ResponseEntity.status(HttpStatus.CREATED).body(technologiesConverter.convertToDto(savedTechnologies));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTechnologies(@PathVariable Long id) {

    technologiesService.deleteTechnologies(id);
    
    return ResponseEntity.noContent().build();

}
    
}
