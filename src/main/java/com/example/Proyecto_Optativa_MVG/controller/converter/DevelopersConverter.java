package com.example.Proyecto_Optativa_MVG.controller.converter;

import org.springframework.stereotype.Component;

import com.example.Proyecto_Optativa_MVG.controller.dto.DevelopersDto;
import com.example.Proyecto_Optativa_MVG.persistence.model.Developers;

@Component 
public class DevelopersConverter {
    
    public DevelopersDto convertToDto(Developers developers){

        DevelopersDto developersDto = new DevelopersDto();

        developersDto.setDevName(developers.getDevName());
        developersDto.setEmail(developers.getEmail());
        developersDto.setGithubUrl(developers.getGithubUrl());
        developersDto.setLinkedinUrl(developers.getLinkedinUrl());

        return developersDto;
    }
    

    public Developers convertToEntity(DevelopersDto developersDto){

        Developers developers = new Developers();

        developers.setDevName(developersDto.getDevName());
        developers.setEmail(developersDto.getEmail());
        developers.setGithubUrl(developersDto.getGithubUrl());
        developers.setLinkedinUrl(developersDto.getLinkedinUrl());

        return developers;
    }
}
