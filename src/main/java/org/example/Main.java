package org.example;

import java.util.Scanner;

import static org.example.calculadoraBinaria.CalculadoraBin.esBinario;
import static org.example.recursion.Recursion.generarSucesion;
import static org.example.recursion.Recursion.generarSucesionInversa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Calculadora Binaria

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número binario de 16 dígitos:");

        //Se ingresa el numero
        String numeroBinario = scanner.nextLine();

        // Determina si es binario
        if(numeroBinario.length() != 16 || !esBinario(numeroBinario)) {
            System.out.println("El número ingresado no es binario o no tiene 16 dígitos.");
            return;
        }

        // Hace conversiones
        int decimal = Integer.parseInt(numeroBinario, 2);
        String octal = Integer.toOctalString(decimal);
        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal.toUpperCase());
        scanner.close();
         */

        Scanner scanner = new Scanner(System.in);

        //Se ingresan los elementos
        System.out.println("Ingrese los dos elementos de la sucesión:");
        int elemento1 = scanner.nextInt();
        int elemento2 = scanner.nextInt();

        System.out.println("Ingrese las posiciones de los elementos en la sucesión:");
        int posicion1 = scanner.nextInt();
        int posicion2 = scanner.nextInt();

        System.out.println("Ingrese la cantidad de términos de la sucesión que desea generar:");
        int cantidadTerminos = scanner.nextInt();

        // Se imprime la sucesión de izquierda a derecha
        System.out.println("Sucesión de izquierda a derecha:");
        generarSucesion(elemento1, elemento2, posicion1, posicion2, cantidadTerminos, 0 );

        // Se imprime la sucesión de derecha a izquierd
        System.out.println("\nSucesión de derecha a izquierda:");
        generarSucesionInversa(elemento1, elemento2, posicion1, posicion2, cantidadTerminos);

        scanner.close();





    }
}