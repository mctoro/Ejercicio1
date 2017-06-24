/*
 * Crear un array con las notas de un alumno, mostrar la media y que pinte la calificación
 */
package com.cice.Ejercicios;

/**
 *
 * @author Miguel
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // creamos array con las notas
        
        double[] notas = {3, 5 , 7 , 6, 9};
        double notaMedia;
        double sumaNotas = 0;
        //calcular la media aritmetica
        
        for(double nota : notas){
            sumaNotas += nota;
            
        }
        
        notaMedia = sumaNotas /notas.length;
        
        if (notaMedia <5){
            System.out.println("La nota media es de INSUFICIENTE ");
            System.out.println(notaMedia);
          
        } else if (notaMedia <6){
            System.out.println("La nota media es SUFICIENTE");
            System.out.println(notaMedia);
        
        } else if (notaMedia <7){
            System.out.println("La nota media es de BIEN");
            System.out.println(notaMedia);
            
        } else if (notaMedia <9) {
            System.out.println("La nota media es de NOTABLE");
            System.out.println(notaMedia);
        
        } else{
        System.out.println("La nota media es de SOBRESALIENTE");
        System.out.println(notaMedia);
    }
        
        
    }
    
}
