package com.example.Proyecto_Optativa_MVG.service;

import com.example.Proyecto_Optativa_MVG.persistence.model.Developers;

public interface DevelopersService {
    Developers createDevelopers(Developers developers);
    void deleteDevelopers(Long devId);
}
