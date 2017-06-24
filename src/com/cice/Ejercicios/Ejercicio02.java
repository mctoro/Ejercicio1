/*
 * Escribir un programa que escriba la pantalla, tu nombre completo en una linea 
* y en la siguiente linea tu fecha de nacimiento. Vampos a crear 2 variables de tipo String, cada una contendrá la información solicitada.

* Pintamos las 2 lineas con un "sout"
 */
package com.cice.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        // Primero creamos las variables necesarias
        String nombre;
        String fecha;
        
        //vamos a utilizar el scanner
        Scanner sc = new Scanner (System.in);
        
        //pintamos indicaciones. si quitamos el ln de println se queda en la misma linea (es lo que necesitamos ahora)
        
        System.out.println("Ejercicio 2");
        System.out.println("===========");
        System.out.print("Introduce tu nombre completo: ");
        
        //almaceno mi nombre
        
        nombre = sc.nextLine();
        
        //solicito fecha nacimiento
        
        System.out.print("Introduce tu fecha de nacimiento: ");
        
        fecha = sc.nextLine();
        
        //ahora vamos a pintar el resutlado de los datos introducidos.
        
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Naciste el: " + fecha);
    }
    
}
