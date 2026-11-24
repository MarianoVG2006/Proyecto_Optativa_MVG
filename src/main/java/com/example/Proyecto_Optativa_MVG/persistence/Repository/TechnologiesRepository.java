package com.example.Proyecto_Optativa_MVG.persistence.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Proyecto_Optativa_MVG.persistence.model.Technologies;

public interface TechnologiesRepository extends JpaRepository<Technologies, Long> {
    
}
