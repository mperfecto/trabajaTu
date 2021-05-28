package com.ssii.project.controllers;

import java.text.MessageFormat;

import com.ssii.project.models.ProjectModel;
import com.ssii.project.services.ProjectBDService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JugadoresController {
    
    @Autowired
    ProjectBDService projectBDService;
    
    @GetMapping("guardar")
    @PostMapping("/guardar")
    public String mensajeQuery(@RequestParam String nombre,@RequestParam String apellido,@RequestParam int dorsal) {

        ProjectModel jugador = new ProjectModel();

        Object[] params = {nombre, apellido, dorsal};

        String nombreSt = params[0].toString();
        String apellidoSt = params[1].toString();
        int dorsalSt = (int)params[2];
        
        jugador.setNombre(nombreSt);
        jugador.setApellido(apellidoSt);
        jugador.setDorsal(dorsalSt);

        projectBDService.guardarJugador(jugador);

        return MessageFormat.format("Se han guardado lo datos del jugador {0} {1} con el dorsal {2}", params);
    }
}
