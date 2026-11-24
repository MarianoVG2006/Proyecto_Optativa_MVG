package com.example.Proyecto_Optativa_MVG.persistence.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Proyecto_Optativa_MVG.persistence.model.Projects;

public interface ProjectsRepository extends JpaRepository<Projects, Long> {

    Optional<Projects> findByWordProjects(String wordProjects);
    
}
