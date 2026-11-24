package com.example.Proyecto_Optativa_MVG.persistence.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Proyecto_Optativa_MVG.persistence.model.Developers;

public interface  DevelopersRepository extends JpaRepository<Developers, Long> {
    
}

