package com.ssii.project.controllers;

import com.ssii.project.services.ProjectBDService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    
@Autowired
ProjectBDService projectBDService;

    @RequestMapping("/guardaJugador")
    public String insercionDatos(){
        return "insertarDatos";
    }

}
