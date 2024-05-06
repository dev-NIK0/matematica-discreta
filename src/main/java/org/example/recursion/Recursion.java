package org.example.recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Recursion {
    public static void generarSucesion(int elemento1, int elemento2, int posicion1, int posicion2, int cantidadTerminos , int indice) {

        if (indice >= cantidadTerminos) {
           return;
        }

        if (indice == 0 || indice == 1) {
            System.out.print(indice == 0 ? elemento1 + " " : elemento2 + " ");
        } else {
            int nuevoElemento;
            if(elemento1 > elemento2){
               nuevoElemento = elemento1 - elemento2;
            }else{
                nuevoElemento = elemento1 + elemento2;
            }
            System.out.print(nuevoElemento + " ");
            elemento1 = elemento2;
            elemento2 = nuevoElemento;
        }

        generarSucesion(elemento1, elemento2, posicion1, posicion2, cantidadTerminos , indice + 1);
    }

    // Recursion para la sucesion de derecha a izquierda
    public static void generarSucesionInversa(int elemento1, int elemento2, int posicion1, int posicion2, int cantidadTerminos) {

        if (cantidadTerminos <= 0) {
            return;
        }

        // Imprimir los dos primeros elementos si la cantidad de terminos > 2
        if (cantidadTerminos == 2) {
            System.out.print(elemento1 + " ");
            System.out.print(elemento2 + " ");
        }

        // Si aún hay más elementos por generar, continuar con la recursión

       if (cantidadTerminos > 2) {
            int nuevoElemento;
            if(elemento1 > elemento2){
                nuevoElemento = elemento1 - elemento2;
            }else{
                nuevoElemento = elemento1 + elemento2;
            }
            generarSucesionInversa( nuevoElemento,elemento2 , posicion2, posicion1, cantidadTerminos - 1);
            System.out.print(elemento1 + " ");
       }


    }
}
