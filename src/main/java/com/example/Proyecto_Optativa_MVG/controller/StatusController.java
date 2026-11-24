package com.example.Proyecto_Optativa_MVG.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto_Optativa_MVG.controller.converter.StatusConverter;
import com.example.Proyecto_Optativa_MVG.service.StatusService;

import lombok.AllArgsConstructor;

@RestController 
@CrossOrigin 
@AllArgsConstructor 
@RequestMapping ("api/v1")
public class StatusController {

    StatusConverter statusconverter;

    StatusService statusservice;

    
    
}
