package com.example.Proyecto_Optativa_MVG.persistence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Proyecto_Optativa_MVG.persistence.model.Status;

public interface StatusRepositorys extends JpaRepository<Status, Long> {
    
}
