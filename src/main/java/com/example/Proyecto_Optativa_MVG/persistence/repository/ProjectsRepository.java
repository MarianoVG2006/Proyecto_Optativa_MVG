package com.example.Proyecto_Optativa_MVG.persistence.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Proyecto_Optativa_MVG.persistence.model.Projects;

public interface ProjectsRepository extends JpaRepository<Projects, Long> {

    List<Projects> findByWordProjects(String wordProjects);
    
    
}
