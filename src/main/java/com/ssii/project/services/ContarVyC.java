package com.ssii.project.services;

public class ContarVyC {

    public static boolean esVocal(char letra) {

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            return true;
        } else return false;

    }

    public static String contarLetras(String palabra) {

        String palabraMin = palabra.toLowerCase();

        int contVoc = 0;
        int contCons = 0;

        for (int i = 0; i < palabraMin.length(); i++) {
            
            if (esVocal(palabraMin.charAt(i))) {
                contVoc++;
            } else contCons++;

        }

        return "El número de consonantes es: " + contCons + " y el número de vocales es: " + contVoc;

    }



}