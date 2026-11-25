package com.example.Proyecto_Optativa_MVG.controller.dto;

import java.time.LocalDate;

import lombok.Data;

@Data 
public class ProjectsDto {
    
    private String projectName;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String picture;

}
