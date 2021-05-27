package com.ssii.project.controllers;

import java.text.MessageFormat;

import com.ssii.project.models.ProjectModel;
import com.ssii.project.services.ContarLetrasService;
import com.ssii.project.services.ProjectBDService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @Autowired
    ContarLetrasService contarLetrasService;   
    
    @Autowired
    ProjectBDService projectBDService;

    @Autowired
    ProjectModel projectModel;

    @Bean
    ProjectModel getprojectmodel(){
		return new ProjectModel();
	}
    
    @GetMapping("/contar/{palabra}")
    public String vocalesConsonantes(@PathVariable String palabra) {
        return ContarLetrasService.contarLetras(palabra);
    }

    @GetMapping("/listar")
    public String jugadores() {
        return projectBDService.obtenerDatos().toString();
    }

    @GetMapping("/guardar")
    public String GuardaPorQuery(@RequestParam String nombre,@RequestParam String apellido,@RequestParam int dorsal){

        ProjectModel nuevoJugador = new ProjectModel();

        Object params[] = {nombre, apellido, dorsal};

        String nombreSt = params[0].toString();
        String apellidoSt = params[1].toString();
        int dorsalSt = (int)params[2];
        
        nuevoJugador.setNombre(nombreSt);
        nuevoJugador.setApellido(apellidoSt);
        nuevoJugador.setDorsal(dorsalSt);

        projectBDService.guardarDatos(nuevoJugador);

        return MessageFormat.format("Se han guardado lo datos del jugador {0} {1} con el dorsal {2}", params);
    }

}