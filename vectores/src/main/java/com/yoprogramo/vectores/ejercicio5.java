/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.vectores;


import java.util.Scanner;

/**
 *
 * @author c.olguin
 */
public class ejercicio5 {
    //5. Se necesita un vector que permita cargar por teclado el nombre de 10 animales.
    //A partir de esta carga, se desea otro vector que copie los mismos nombres pero en el orden inverso,
    //es decir, si los nombres son: perro, gato, lagartija, el nuevo vector debe contener:
    //lagartija, gato, perro. Una vez realizado el cambio, mostrar por pantalla ambos vectores para compararlos.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String vector[]=new String [10] ;
        String animales;
        
        
        for (int i = 0; i <vector.length; i++) {
            System.out.println("ingrese 10 animales:");
           animales=leer.next();
            vector[i]=animales;   
              
             System.out.println(" posicion " +i+  "--->[" + vector[i]+"]"); 
        }
        
        System.out.println("cadena invertida :");
        for ( int i= vector.length-1 ; i >=0; i--) {
            System.out.println("posicion " +i+  "--->[" + vector[i]+"]");
        }
      
    }
    
}
