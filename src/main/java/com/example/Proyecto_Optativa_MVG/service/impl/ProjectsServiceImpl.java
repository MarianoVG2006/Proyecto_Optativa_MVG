package com.example.Proyecto_Optativa_MVG.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Proyecto_Optativa_MVG.persistence.model.Projects;
import com.example.Proyecto_Optativa_MVG.persistence.repository.ProjectsRepository;
import com.example.Proyecto_Optativa_MVG.service.ProjectsService;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class ProjectsServiceImpl implements ProjectsService {

    ProjectsRepository projectsRepository;

    @Override 
    public List<Projects> getAllProjects() {
        return projectsRepository.findAll();
    }

    @Override 
    public List<Projects> getProjectByWordProjects(String wordProjects) {
        return projectsRepository.findByWordProjects(wordProjects);
    }    

    @Override 
    public Projects createProject(Projects project) {
        return projectsRepository.save(project);
    }

    @Override
    public Projects updateProject(Long projectId, Projects project) {
        Projects existingProject = projectsRepository.findById(projectId).orElseThrow(() -> new RuntimeException("Project not found with id: " + projectId));
        existingProject.setProjectName(project.getProjectName());
        existingProject.setDescription(project.getDescription());
        existingProject.setStartDate(project.getStartDate());
        existingProject.setEndDate(project.getEndDate());
        existingProject.setRepositiryUrl(project.getRepositiryUrl());
        existingProject.setDemoUrl(project.getDemoUrl());
        existingProject.setPicture(project.getPicture());
        return projectsRepository.save(existingProject);
    }

    @Override
    public void deleteProject(Long projectId) {
       projectsRepository.deleteById(projectId);
    } 

}
