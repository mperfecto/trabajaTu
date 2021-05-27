package com.ssii.project.services;

import com.ssii.project.repositories.ProjectRepository;
import com.ssii.project.models.ProjectModel;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectBDService {

    @Autowired
    ProjectRepository projectRepository;

    public ProjectModel guardarDatos(ProjectModel modeloDatos){
        return projectRepository.save(modeloDatos);
    }

    public ArrayList<ProjectModel> obtenerDatos(){
        return (ArrayList<ProjectModel>) projectRepository.findAll();
    }


}
