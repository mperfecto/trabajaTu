package com.ssii.project.controllers;

import com.ssii.project.models.ProjectModel;
import com.ssii.project.services.ContarLetrasService;
import com.ssii.project.services.InvertirCadenaService;
import com.ssii.project.services.ProjectBDService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @Autowired
    ContarLetrasService contarLetrasService;   

    @Autowired
    ProjectModel projectModel;

    @Autowired
    ProjectBDService projectBDService;

    @Bean
    ProjectModel getprojectmodel(){
		return new ProjectModel();
	}
    
    @GetMapping("/")
    public String inicio() {
        return "Bienvenido a esta página";
    }

    @GetMapping("/contar/{palabra}")
    public String vocalesConsonantes(@PathVariable String palabra) {
        return ContarLetrasService.contarLetras(palabra);
    }

    @GetMapping("/listar")
    public String listarJugadores() {
        return projectBDService.obtenerJugadores().toString();
    }    

    @RequestMapping("/invertir/{frase}")
    public  String invertirCadena(@PathVariable String frase){
        return InvertirCadenaService.invertirCadena(frase);
    }

}