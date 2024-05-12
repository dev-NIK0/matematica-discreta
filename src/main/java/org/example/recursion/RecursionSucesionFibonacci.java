package org.example.recursion;

import java.util.Scanner;

public class RecursionSucesionFibonacci {

    public static void main(String [] args){

        Scanner numeroIngresado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de terminos enteros que desea de la sucesion fibonacci");
        int cantidadTerminos = numeroIngresado.nextInt();

        for (int i = 0; i < cantidadTerminos; i++) {
            System.out.println("Posicion:" + i + " numero: " + sucesionFibonacci(i) + " ");

        }
    }

    public static int sucesionFibonacci(int num){

        if(num == 0){
            return 0;
        }else if (num == 1){
            return 1;
        }else{
            return sucesionFibonacci(num - 1) + sucesionFibonacci(num - 2);
        }
    }

}
