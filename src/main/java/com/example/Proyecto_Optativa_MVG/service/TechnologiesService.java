package com.example.Proyecto_Optativa_MVG.service;

import com.example.Proyecto_Optativa_MVG.persistence.model.Technologies;

public interface TechnologiesService {
    Technologies createTechnologies(Technologies technologies);
    void deleteTechnologies(Long techId);
}
