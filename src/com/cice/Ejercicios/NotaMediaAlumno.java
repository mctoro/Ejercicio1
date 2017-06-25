/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.Ejercicios;

import java.util.Scanner;



/**
 *
 * @author Miguel
 */
public class NotaMediaAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    double mates;
    double lengua;
    double historia;
    double biologia;
    double filosofia;
    
    Scanner sc = new Scanner (System.in);
        System.out.println("Introduce tu nota de mates");
        mates = sc.nextInt();
        System.out.println("Introduce tu nota de lengua");
        lengua = sc.nextInt();
        System.out.println("Introduce tu nota de historia");
        historia = sc.nextInt();
        System.out.println("Introduce tu nota de biologia");
        biologia = sc.nextInt();
        System.out.println("Introduce tu nota de filosofia");
        filosofia = sc.nextInt();
        
        double notaMedia;
        
        notaMedia = (mates+lengua+historia+biologia+filosofia)/5;

        
        if (notaMedia <5){
            System.out.println("La nota media " + notaMedia + " es de INSUFICIENTE");
        
          
        } else if (notaMedia <6){
            System.out.println("La nota media " + notaMedia + " es SUFICIENTE");

        
        } else if (notaMedia <7){
            System.out.println("La nota media " + notaMedia + " es de BIEN");

            
        } else if (notaMedia <9) {
            System.out.println("La nota media " + notaMedia + " es de NOTABLE");

        
        } else{
        System.out.println("La nota media " + notaMedia + " es de SOBRESALIENTE");

        
        }
    }

}
    
    

