/*
 * nuestra primera calculadora
 */
package com.cice.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op=0;
        int a;
        int b;
        
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Calculadora v1.0");
            System.out.println("================");
            System.out.println("Elige una opción");
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("0. SALIR");
            System.out.println("================");
            op = sc.nextInt();
            System.out.println("has elegido la opción: " + op );
            
           
            if (op == 1) {
                System.out.println("Introduce el primer numero: ");
            a = sc.nextInt();
            
            System.out.println("Introduce el segundo numero: ");
            b = sc.nextInt();
                System.out.println(a+b);
            } else if (op == 2) {
                System.out.println("Introduce el primer numero A: ");
            a = sc.nextInt();
            
            System.out.println("Introduce el segundo numero: ");
            b = sc.nextInt();
                System.out.println(a-b);
            } else {
                System.out.println("BYE");
            }

            
        } while (op !=0);
        
        
    }
    
}
