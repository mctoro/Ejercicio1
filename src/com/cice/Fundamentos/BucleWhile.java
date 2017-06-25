/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.Fundamentos;

/**
 *
 * @author Miguel
 */
public class BucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //la bombilla está porque damos valor a "a" que luego no usamos (porque lo hemos comentado).
        int a = 1;
        int b = 0;
        /*
        while (a>b){
            System.out.println("A es mayor que B");
        */    
           a=b;
       
        /*al hacer el do while, primero hace el "do" y luego pregunta al "while". 
        * a tener en cuenta que no se hace bucle infinito porque hemos dado la orden de que a=b
        */
        do {
        
            System.out.println("A pude ser mayor que B");
            
        }while (a>b);
           
            
        }
    }
   