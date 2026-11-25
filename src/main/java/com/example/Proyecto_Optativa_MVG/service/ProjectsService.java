package com.example.Proyecto_Optativa_MVG.service;

import java.util.List;

import com.example.Proyecto_Optativa_MVG.persistence.model.Projects;

public interface ProjectsService {
    List<Projects> getAllProjects();
    List<Projects> getProjectByWordProjects(String wordProjects);
    Projects createProject(Projects project);
    Projects updateProject(Long projectId, Projects project);
    void deleteProject(Long projectId);
    
}
