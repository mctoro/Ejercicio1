/*
* escribir un programa que dado el precio de un producto, calcule el precio aplicando un descuento de 15%
* tipo de dato double
 */
package com.cice.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

double precio;
double resultado;

Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio 03");
        System.out.println("============");
        
        System.out.print("Introduce el precio de las deportivas: ");
        precio = sc.nextDouble();
        
resultado = precio * (1-0.15);

        System.out.println("El precio de las deportivas sin rebaja es de: " + precio + "€");
        System.out.println("El precio de las deportivas CON rebaja es de: " + resultado + "€");
        
    }

}