/*
* Pedir al usuario que introduzca 2 numeros enteros y vamos a decir si son iguales o 
* a es mayor que b o menor que b.
 */
package com.cice.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 01");
        System.out.println("===========");
        
        Scanner sc = new Scanner (System.in);
        
int a;

int b;

        System.out.println("Introduce un numero entero: ");
        
a = sc.nextInt();

        System.out.println("Introduce otro número entero: ");

b = sc.nextInt();

if (a > b) {
    System.out.println("A (" + a + ") es mayor que B (" + b + ")");
} else if (a < b) {
    System.out.println("A (" + a + ") es menor que B (" + b + ")");
} else {
    System.out.println("A (" + a + ") es igual que B (" + b + ")");
}
}
}
