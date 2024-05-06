package org.example.calculadoraBinaria;

import java.util.Scanner;

public class CalculadoraBin {

        //En esta parte se determina si lo que se escribe en el scanner es un numero binario
    public static boolean esBinario(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter != '0' && caracter != '1') {
                return false;
            }
        }
        return true;
    }
}
