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
public class ejerc3 {
    //3.Se desea un programa que sea capaz de rellenar completamente con números 1 una matriz de 4 x 4 
    //a excepción de su diagonal principal, la cual debe ser rellenada con números 0. 
    //Una vez realizada la carga, se desea mostrar la matriz de forma ordenada por pantalla. 
    
    //Tener como ejemplo la matriz que se presenta a continuación. 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int Matriz[][]=new int [4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==j||j==i) {
                    Matriz[i][j]=0;
                }else{
                    Matriz[i][j]=1;
                }
            }
            
        }
         System.out.println("la matriz es:"); 
      
         for (int i = 0; i <4; i++) {
             for (int j = 0; j < 4; j++) {
                  System.out.print("["  +Matriz [i][j]+  "]" + "  " );
             }
             System.out.println("");
        }
         
    }
    
}
