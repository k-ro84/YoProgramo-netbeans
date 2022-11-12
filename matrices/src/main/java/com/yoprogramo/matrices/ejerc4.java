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
public class ejerc4 {
//4.Una casa de comida rápida utiliza una matriz de 20 filas y 5 columnas para determinar cada plato del menú y 
//sus correspondientes ingredientes que contiene.
    //Para ello, cada fila representa un plato principal en donde en la primera columna se especifica su nombre 
 //(por ejemplo: Milanesa), y en las demás los posibles acompañamientos que puede tener el plato 
 //(por ejemplo, puré, ensalada rusa, papas fritas, ensalada de lechuga y tomate, ensalada de zanahoria, etc).
    //En caso de que tenga el plato menos de 4 tipos de acompañamiento,
 //en la matriz se cargará la palabra Ninguno en las posiciones que queden vacías.
    
    //Se desea un programa que sea capaz de permitir la carga de la matriz, de buscar un plato en particular 
 //que un cliente ingrese por teclado y mostrarle de forma automática los posibles acompañamientos del mismo. 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String Matriz[][]=new String[20][5];
       int opcion;
        do {
             System.out.println("   -----------------------------  ");
              System.out.println("  |°            menu           °| ");
              System.out.println("  | 1:             | ");
              System.out.println("  | 2:             | ");
              System.out.println("  | 3:             | ");
              System.out.println("  | 4:             | ");
              System.out.println("  | 5:  salir                   | ");
              System.out.println("  |        elija opcion !!!     | ");
              System.out.println("   ------------------------------ ");
              opcion=leer.nextInt();
        } while (true);
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//
//        for (int i = 0; i <20; i++) {
//             System.out.println("Introduzca el plato principal [" + i + "]");
//             plato =leer.next();  
//            
//            for (int j = 0; j <4; j++) {
//                System.out.println("posibles acompañamientos[" + j + "]");
//    
//            }
//        }
////mostrar
//            for (String[] Matriz1 : Matriz) {
//                for (int j = 0; j < Matriz1.length; j++) {
//                    System.out.print("[" + Matriz1[j] + "]" + "  ");
//                }
//                System.out.println("");
//            }

        
    }

}
