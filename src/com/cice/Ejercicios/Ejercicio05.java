/*
 * desarrollar un programa que a partir de un determinado numero sume todos los valores consecutivos de este numero hasta llegar al 100.
 */
package com.cice.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduzca un numero entero: ");
        
        int numero;
        int suma = 0;
        
        numero = sc.nextInt();
        
        for (int i=numero; suma<=100; i++){
            System.out.println("Dado el numero: (" + numero + ") la suma de sus consecutivos es: " + suma);
    suma += i;
    
           
            
        
        }
        
    }
    
}
