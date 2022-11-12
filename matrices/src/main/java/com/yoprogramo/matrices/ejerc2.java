/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.matrices;

import java.util.Scanner;

/**
 *
 * @author bullaresinfo
 */
public class ejerc2 {
   //2.Una escuela primaria utiliza una matriz para calcular los promedios de sus alumnos.
   //Para ello tienen una matriz de 10 filas, donde cada fila representa a un alumno y 4 columnas. 
    //Las primeras 3 columnas representan las notas de cada uno de los alumnos,mientras que la 4 es el promedio de las mismas. 
    //Se desea un programa que sea capaz de permitir la carga por teclado de las 3 notas de cada alumno,
    //de realizar el cálculo automático del promedio, de guardar el mismo en la 4 columna 
   //y luego mostrar por pantalla cada una de las notas y el promedio obtenido. Por ejemplo.

    //Nota: tener en cuenta que generalmente las calificaciones y los promedios no suelen ser números enteros, 
    //sino que pueden tener decimales.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double matriz[][]=new double[10][4];
        double sum=0.0;
        
        
        //mostrar
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                 System.out.println("ingrese la nota para el estudiante n°: " + i ); 
                 matriz[i][j]=leer.nextDouble();
                 sum= sum+  matriz[i][j];
            }
            matriz[i][3]=sum/3;
           sum=0.0;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Estudiante n° :"+ i+ "");
            for (int j = 0; j < 3; j++) {
                
               System.out.println(" las notas del estudiante son:  ["  +matriz [i][j]+  "]"  );   
               
            }
            System.out.println("el promedio de notas para el alumno " + i+ " es de: ["  +matriz [i][3]+  "]");
        }
        
          for (int i = 0; i < 10; i++) {  
            for (int j = 0; j < 4; j++) {
                System.out.print("["  +matriz [i][j]+  "]" + "  ");
            }
          }
    }
    
}
