package com.example.Proyecto_Optativa_MVG.service.impl;


import org.springframework.stereotype.Service;

import com.example.Proyecto_Optativa_MVG.persistence.model.Technologies;
import com.example.Proyecto_Optativa_MVG.persistence.repository.TechnologiesRepository;
import com.example.Proyecto_Optativa_MVG.service.TechnologiesService;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class TechnologiesServiceImpl implements TechnologiesService {
    
    TechnologiesRepository technologiesRepository;

    @Override 
    public Technologies createTechnologies(Technologies technologies){
        return technologiesRepository.save(technologies);
    }

    @Override 
    public void deleteTechnologies(Long techId){
        technologiesRepository.deleteById(techId);
    }

}
