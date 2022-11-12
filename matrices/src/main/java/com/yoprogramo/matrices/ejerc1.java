/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.matrices;

import java.util.Scanner;

/**
 *
 * @author c.olguin
 */
public class ejerc1 {
   //1. Una matriz de 5 filas x 3 columnas almacena el total de goles 
   //de 5 jugadores de futbol en los últimos 3 partidos que jugaron,
   //donde cada fila representa a un jugador y cada columna a la cantidad de goles que hizo. 
   //   Se necesita un programa que sea capaz de permitir la carga de los goles, 
   //calcular el promedio de goles realizado por cada jugador 
   //y almacenar el resultado en un vector de 5 posiciones, donde cada posición representará a un jugador.
   //Tener en cuenta el siguiente diagrama para llevar a cabo el planteo:
   
   //Nota: tener en cuenta que el promedio de goles puede dar como resultado un número que NO SEA ENTERO.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
  
      double matriz[][]=new double[5][3];

      double vector[]= new double[5];
      double cont=0;
      
      // lenar y realizar el promedio
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese los goles realizados por el jugador : " +i+ " en el partido "+j);
               matriz[i][j] =leer.nextDouble();
                cont=cont+matriz[i][j];
                vector[i]=matriz[i][j];
            }  
            vector[i]=cont/3;
         cont=0.0;
        }
        
        // mostrar el promedio segun jugador
            System.out.println("podriamos decir que : "); 
        for (int i = 0; i < vector.length; i++) {
             System.out.println("el promedio de goles por partido de este jugador es de: "+ i +" "+"["+ vector[i]+"]");
        }
        // vector de promedios
          System.out.println("planilla de promedios : ");
        for (int i = 0; i < vector.length; i++) {
             System.out.println( "[" + vector[i]+ "]");
        }
      
         
    }
    
}
