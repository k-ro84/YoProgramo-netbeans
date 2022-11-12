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
public class ejerc5 {
//5.Una empresa constructora desea llevar a cabo un premio para sus obreros que hayan realizado horas extras 
    //en los últimos 6 meses. Para ello, lleva una matriz de control de 15 filas x 6 columnas, 
    //donde cada fila corresponde a un empleado distinto y donde cada columna representa el total de horas trabajadas por mes.
    //El monto de horas normal trabajado x mes es de 8 horas diarias, 5 días a la semana, 4 semanas por mes, es decir: 160 horas.
    //Todo monto superior a este es considerado como horas extras.

    //Se desea un programa que permita la carga de horas trabajadas por cada obrero y 
    //que sea capaz de determinar aquellos que hayan realizado horas extras. 
    //Para registrar las horas extras realizadas se utilizará un vector de 15 posiciones en donde se deberá calcular y 
    //almacenar la cantidad de horas extras de cada obrero. 
    //En caso de que no haya realizado horas extras, deberá incluirse un número 0. Tomar como ejemplo la siguiente imagen:
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int Matriz[][]=new int [15][6];
        int cont=0;
        int vector[]=new int[15];
        
        //mostrar
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.println("ingrese la cantidad de horas trabajadas : " +j );
                  Matriz[i][j] =leer.nextInt();
                     cont=cont+Matriz[i][j];
                 vector[i]=Matriz[i][j];
              
            }
         cont=0;
           
            System.out.println("");
        }
        
           // vector de 15 posiciones con las horas extras
          System.out.println("planilla de horas extras : ");
        for (int i = 0; i < 15; i++) {
             
              if(160<=vector[i]) {
                System.out.println( "trabajo una correcta cantidad de horas mensuales"+"[" + vector[i]+ "]");
               }else{
                System.out.println("excedio la cantidad de horas por mes");
                }
             cont=0;
        
        }
    }
    
}
