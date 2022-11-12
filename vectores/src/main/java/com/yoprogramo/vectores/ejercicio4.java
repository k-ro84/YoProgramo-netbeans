/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.vectores;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bullaresinfo
 */
public class ejercicio4 {
    //4. En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales de las 23 provincias argentinas 
    //en el último mes. A partir de esta información,
    //un noticiero desea determinar el top 5 de las temperaturas más altas para poder mostrar en la pantalla de su programa,
    //para ello se necesita un programa que sea capaz de recorrer el vector de temperaturas,
    //determinar las 5 más altas y copiarlas en un nuevo vector de 5 posiciones
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int vectorp[]=new int [23] ;
        
        
        System.out.println("las temperaturas en las capitales de las 23 han sido de :");
        for (int i = 0; i < vectorp.length; i++) { 
            vectorp[i]=(int)( Math.random()*50);
            System.out.println(" provincia : " +i+   "---> temperatura maxima registrada :["  + vectorp[i]+"]"); 
        }
        
        int mayores;
        mayores=vectorp[0];
       
        for (int i = 0; i < vectorp.length; i++) {
            if (vectorp[i]>=mayores ) {
              mayores=vectorp[i];
            }  
        }
        System.out.println("");
        System.out.println("la mayor temperatura registrada ha sido :" +  mayores);
        System.out.println("");
        
        Arrays.sort(vectorp);
        System.out.println("vector ordenado y mostrando solo 5 elementos o posiciones:");
        for (int i= vectorp.length-1 ; i >=18; i--) {
             System.out.println("una de las 5 mas altas temperaturas ha sido : ["+ vectorp[i]+"]");
        }
        
        
    }
}
