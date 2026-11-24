package com.example.Proyecto_Optativa_MVG.service.impl;


import org.springframework.stereotype.Service;

import com.example.Proyecto_Optativa_MVG.persistence.Repository.StatusRepository;
import com.example.Proyecto_Optativa_MVG.service.StatusService;
import com.example.Proyecto_Optativa_MVG.persistence.model.Status;
import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class StatusServiceImpl implements StatusService {

    StatusRepository statusRepository;

    @Override 
    public Status getStatusById(Long id){
        return statusRepository.findById(id).orElseThrow(() -> new RuntimeException("Status con id: "+id+" no encontrado"));
    }
   
    
}
