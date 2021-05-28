package com.ssii.project.services;

import org.springframework.stereotype.Service;

@Service
public class InvertirCadenaService {

    public static String invertirCadena(String cadena) {
        
        String cadInvertida = "";

        for (int i = cadena.length()-1; i >= 0; i--) {
            cadInvertida = cadInvertida + cadena.charAt(i);
        }
        
        return cadInvertida;
    
    }
    
}
