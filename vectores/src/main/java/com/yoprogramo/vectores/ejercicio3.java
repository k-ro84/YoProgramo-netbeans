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
public class ejercicio3 {
//3.Se tienen tres vectores. En el primero de ellos se guarda un número de dni, 
    //en el segundo un nombre y en el tercero un apellido. 
    //Se desea un programa que sea capaz de recorrer los tres vectores AL MISMO TIEMPO 
    //y mostrar cada uno de estos datos por pantalla. 
    //Pista: tener en cuenta que el índice de cada vector es correspondiente al índice de los demás,
    //es decir, los datos contenidos en el índice cero del vector de dni,
    //se corresponde con el índice cero del vector de nombres y el de apellidos.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int vector1[] = new int[5];
        String vector2[] = new String[5];
        String vector3[] = new String[5];
        int dni;
        String nombre;
        String apellido;

        System.out.println("ingrese los datos requeridos para el registro:");
        
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("ingrese su dni : ");
            dni = leer.nextInt();
            vector1[i]=dni;
        }
        
        
        //mostrar al ingresar
       // for (int i = 0; i < vector1.length; i++) {
       //      System.out.println(" posicion " + i + "--->[" + vector1[i] + "]" );
       // }
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("ingrese nombre/s : ");
            nombre = leer.next();
            vector2[i]=nombre;
        }
        //mostrar al ingresar
       //   for (int i = 0; i < vector2.length; i++) {
        //     System.out.println(" posicion " + i + "--->[" + vector2[i] + "]" );
       // }
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("ingrese apellido/s : ");
            apellido = leer.next();
            vector3[i]=apellido;
        }
         
        //mostrar al ingresar
       //   for (int i = 0; i < vector3.length; i++) {
       //      System.out.println(" posicion " + i + "--->[" + vector3[i] + "]" );
       // }
        System.out.println("     registro :   ");
        for (int i = 0; i < (vector1.length&vector2.length&vector3.length); i++){

           System.out.println(i +"dni : " +"["+vector1[i]+"]"+"nombre : "+ "["+vector2[i]+"]"+ "apellido : "+"["+vector3[i]+ "]");
    }
        
       
        // todo dentro de un mismo vector
        //System.out.println("Ingrese el tamaño de su vector a generar");
        // int n = leer.nextInt();
        // int vector[]= new int[n];
        // for (int i = 0; i < n; i++) {
        //      System.out.println("Ingrese su dni : ");
        //    int dni = leer.nextInt();
        //       System.out.println("nombre/s: ");
        //    String nombre = leer.next();
        //       System.out.println("Apellido/s: ");
        //    String apellido = leer.next();
        //   System.out.println("dni : " + dni + "  nombre/s: " + nombre + " apellido/s " + apellido );
        // }
    
    }
}
