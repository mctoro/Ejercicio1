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
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Entre otras cosas, el "BucleFor" sirven para recorrer arrays.
       int[] arrayEnteros = { 1 , 2 , 3 , 4 , 5};
       //for (int i = 0; i < 10; i++). para hacer un bucle necesita un punto de origen, 
       //una condición y un incremento.
       //vamos a probar un bucle de numeros pares hasta el 10.
       
       for (int i = 0; i<=10; i++){
           if (i % 2 == 0) {
               System.out.println(i);
               
           }
}
        System.out.println("*************");
       for ( int i = 0; i <arrayEnteros.length; i++){
           System.out.println(arrayEnteros [i]);
       }
    }
    
}
