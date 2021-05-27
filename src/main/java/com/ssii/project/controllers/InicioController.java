package com.ssii.project.controllers;

import com.ssii.project.services.ContarVyC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    @GetMapping("/contar/{palabra}")
    public String VocalesConsonantes(@PathVariable String palabra) {
        String res = ContarVyC.contarLetras(palabra);
        return res;
    }

}