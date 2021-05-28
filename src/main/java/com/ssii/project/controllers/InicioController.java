package com.ssii.project.controllers;

import java.text.MessageFormat;

import com.ssii.project.models.ProjectModel;
import com.ssii.project.services.ContarLetrasService;
import com.ssii.project.services.InvertirCadenaService;
import com.ssii.project.services.ProjectBDService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    
    @GetMapping("/")
    public String inicio() {
        return "Bienvenido a esta página";
    }

    @GetMapping("/contar/{palabra}")
    public String vocalesConsonantes(@PathVariable String palabra) {
        return ContarLetrasService.contarLetras(palabra);
    }

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

    @GetMapping("/listar")
    public String listarJugadores() {
        return projectBDService.obtenerJugadores().toString();
    }    

    @RequestMapping("/invertir/{frase}")
    public  String invertirCadena(@PathVariable String frase){
        return InvertirCadenaService.invertirCadena(frase);
    }
    
}