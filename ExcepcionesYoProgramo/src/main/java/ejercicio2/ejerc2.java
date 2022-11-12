/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author c.olguin
 */
public class ejerc2 {
//2.Realizar un programa que permita el ingreso de dos números por teclado para ser divididos entre sí.
//Tomar como precaución la utilización del try y el catch por si el segundo número ingresado para dividir se trata de un cero.
//Mostrar un mensaje adecuado en caso de que se produzca la excepción.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         Integer numero1 = 0, numero2 = 0;
         float division = 0; 
     
         
        System.out.print("Ingrese numerador:\n");
        numero1 = leer.nextInt();
            
        System.out.print("Ingrese divisor:\n");
        numero2 = leer.nextInt();
            
        
        try{
            System.out.println("\n su division es : ");
             System.out.println((numero1 +" / "+numero2)+  " = " +  (numero1/numero2)  );
             
        }catch(Exception e){
            if (numero2==0) {
                 System.out.println(" no puede dividir por cero !!!");
            }
             
        }
        
//      
//        try {
//              division = 10 / 0; 
//        }catch (ArithmeticException a) { 
//            System.out.println("Error: división por cero"); 
//        }  
 
    
    }

}
