/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.yoprogramo.vectores;

import java.util.Scanner;

/**
 *
 * @author c.olguin
 */
public class ejercicio1 {
    //1. Se necesita de un vector que sea capaz de almacenar 10 números enteros entre 1 y 100.
    //Realizar un programa que permita la carga por teclado de los 10 números solicitados.

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
          int vector[]=new int[10];
         int num;
         
         
        for (int i = 0; i <vector.length; i++) {
            System.out.println("ingrese numeros del 1 al 100 ´para el vector " + "[" +i+ "]");
            num=leer.nextInt();
            vector[i]=num;
        }
       
        System.out.println("estos son los numeros ingresados desde la consola");
        for (int i = 0; i <vector.length; i++) {
            System.out.print( "[" + vector[i]+ "]");
        }

          
    }
}
