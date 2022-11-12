/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author c.olguin
 */
public class ejerc1 {
//1. Realizar un programa donde se provoque una excepción de tipo “error por desbordamiento”. 
//Tratar la excepción mediante los bloques try y catch y mostrar un mensaje indicando la situación. 
//Por ejemplo: “Se produjo un error por desbordamiento”.  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
           int edades[] ={21,22,23,24};
            System.out.println("la edad en la posicion 4 es : " + edades[4]);
            System.out.println("localizado");
        }catch(Exception e){
            System.out.println("se produjo un error por desbordamiento");
        }
        
        
    }
    
    
}
