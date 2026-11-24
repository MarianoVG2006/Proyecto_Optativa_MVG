package com.example.Proyecto_Optativa_MVG.controller.converter;



import org.springframework.stereotype.Component;

import com.example.Proyecto_Optativa_MVG.controller.dto.ProjectsDto;
import com.example.Proyecto_Optativa_MVG.persistence.model.Projects;

import lombok.AllArgsConstructor;

@Component 
@AllArgsConstructor 
public class ProjectsConverter {
    
    public ProjectsDto convertToDto (Projects projects){
        ProjectsDto projectsdto = new ProjectsDto();
        projectsdto.setProjectName(projects.getProjectName());
        projectsdto.setDescription(projects.getDescription());
        projectsdto.setStartDate(projects.getStartDate());
        projectsdto.setEndDate(projects.getEndDate());
        projectsdto.setPicture(projects.getPicture());
        return projectsdto;
    }

    public Projects convertToEntity(ProjectsDto projectsdto){
        Projects projects = new Projects();
        projects.setProjectName(projectsdto.getProjectName());
        projects.setDescription(projectsdto.getDescription());
        projects.setStartDate(projectsdto.getStartDate());
        projects.setEndDate(projectsdto.getEndDate());
        projects.setPicture(projectsdto.getPicture());
        return projects;
    }




}
