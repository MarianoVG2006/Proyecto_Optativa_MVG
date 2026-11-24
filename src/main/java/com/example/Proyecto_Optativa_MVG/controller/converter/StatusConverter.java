package com.example.Proyecto_Optativa_MVG.controller.converter;

import org.springframework.stereotype.Component;

import com.example.Proyecto_Optativa_MVG.controller.dto.StatusDto;
import com.example.Proyecto_Optativa_MVG.persistence.model.Status;



@Component 
public class StatusConverter {
    
    public StatusDto convertToDto (Status status){

        StatusDto statusdto = new StatusDto();
        statusdto.setStatusName(status.getStatusName());
        return statusdto;
    }

    public Status convertToEntity (StatusDto statusDto){
        Status status = new Status();
        status.setStatusName(statusDto.getStatusName());
        return status;
    }
}
