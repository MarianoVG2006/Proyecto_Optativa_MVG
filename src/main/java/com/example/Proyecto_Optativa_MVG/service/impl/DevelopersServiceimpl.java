package com.example.Proyecto_Optativa_MVG.service.impl;

import org.springframework.stereotype.Service;

import com.example.Proyecto_Optativa_MVG.persistence.model.Developers;
import com.example.Proyecto_Optativa_MVG.persistence.Repository.DevelopersRepository;
import com.example.Proyecto_Optativa_MVG.service.DevelopersService;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class DevelopersServiceimpl implements DevelopersService {

    DevelopersRepository developersRepository;

    @Override
    public Developers createDevelopers(Developers developers) {
        return developersRepository.save(developers);
    }

    @Override
    public void deleteDevelopers(Long devId) {
        developersRepository.deleteById(devId);
    }
    
}