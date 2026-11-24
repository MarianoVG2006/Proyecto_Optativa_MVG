package com.example.Proyecto_Optativa_MVG.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto_Optativa_MVG.controller.converter.ProjectsConverter;
import com.example.Proyecto_Optativa_MVG.controller.dto.ProjectsDto;
import com.example.Proyecto_Optativa_MVG.persistence.model.Projects;
import com.example.Proyecto_Optativa_MVG.service.ProjectsService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@RequestMapping ("/api/v1")
@CrossOrigin 
@AllArgsConstructor 
public class ProjectsController {
    
    ProjectsService projectsService;

    ProjectsConverter converter;

    @GetMapping
    public ResponseEntity<List<ProjectsDto>> getAllProjects(){

        return ResponseEntity.status(HttpStatus.OK).body(projectsService.getAllProjects().stream().map(converter::convertToDto).collect(Collectors.toList()));

    }

    @GetMapping("/{word}")
    public ResponseEntity<List<ProjectsDto>> getProjectsByWord(@PathVariable String word) {

        return ResponseEntity.status(HttpStatus.OK).body(projectsService.getProjectByWordProjects(word).stream().map(converter::convertToDto).toList());
    }

    @PostMapping
    public ResponseEntity<ProjectsDto> createProject(@RequestBody ProjectsDto projectsDto) {

    Projects project = converter.convertToEntity(projectsDto);

    Projects savedProject = projectsService.createProject(project);

    return ResponseEntity.status(HttpStatus.CREATED).body(converter.convertToDto(savedProject));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjectsDto> updateProject(@PathVariable Long id,@RequestBody ProjectsDto projectsDto) {

    Projects project = converter.convertToEntity(projectsDto);

    Projects updatedProject = projectsService.updateProject(id, project);

    return ResponseEntity.status(HttpStatus.OK).body(converter.convertToDto(updatedProject));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {

    projectsService.deleteProject(id);

    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    
    }


}

    

