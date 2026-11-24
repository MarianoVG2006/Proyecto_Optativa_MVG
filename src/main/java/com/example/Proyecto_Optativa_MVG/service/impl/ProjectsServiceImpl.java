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
    public Projects getProjectByWordProjects(String wordProjects) {
        return projectsRepository.findByWordProjects(wordProjects).orElseThrow(() -> new RuntimeException("Project not found with wordProjects: " + wordProjects));
    }

    @Override 
    public Projects createProject(Projects project) {
        return projectsRepository.save(project);
    }

    @Override
    public Projects updateProject(Long projectId, Projects project) {
        Projects existingProject = projectsRepository.findById(projectId).orElseThrow(() -> new RuntimeException("Project not found with id: " + projectId));
        existingProject.setWordProjects(project.getWordProjects());
        existingProject.setDescription(project.getDescription());
        return projectsRepository.save(existingProject);
    }

    @Override
    public void deleteProject(Long projectId) {
       projectsRepository.deleteById(projectId);
    } 

}
