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
public class ejercicio2 {
    //2. En un vector de 15 posiciones se almacenan las edades de 15 alumnos. 
    //Se desea un programa que sea capaz de determinar cuál es la mayor edad 
    //cuál es la menor edad que se encuentra entre los estudiantes.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
          int vector[]=new int[15];
        
        
          for(int i=0;i<vector.length;i++){
           vector[i]=(int)(Math.random()*19+0); 
           System.out.println(" posicion " +i+  "--->[" + vector[i]+"]"); 
          }
        System.out.println("este es su vector generado de manera aleatoria:");
        for (int i = 0; i < vector.length; i++) {
              
           System.out.print("[" +vector[i]+ "]"); 
        }
        
        int mayor;
        int menor;
        menor=mayor=vector[0];
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]>mayor) {
                mayor=vector[i]; 
            }
            if (vector[i]<menor) {
                menor=vector[i];
            }
        }
        System.out.println("");
        System.out.println("el mayor numero dentro del vector es: " +  mayor);
        System.out.println("el menor numero dentro del vector es: " +  menor);
    }
    
}
