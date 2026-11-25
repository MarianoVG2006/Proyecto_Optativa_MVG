package com.example.Proyecto_Optativa_MVG.controller.converter;

import org.springframework.stereotype.Component;

import com.example.Proyecto_Optativa_MVG.controller.dto.TechnologiesDto;
import com.example.Proyecto_Optativa_MVG.persistence.model.Technologies;

@Component 
public class TechnologiesConverter {
    
    public TechnologiesDto convertToDto(Technologies technologies){

        TechnologiesDto technologiesDto = new TechnologiesDto();

        technologiesDto.setTechName(technologies.getTechName());

        return technologiesDto;
    }

    public Technologies convertToEntity(TechnologiesDto technologiesDto){

        Technologies technologies = new Technologies();

        technologies.setTechName(technologiesDto.getTechName());

        return technologies;
    }
}
