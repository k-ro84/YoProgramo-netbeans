/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author c.olguin
 */
public class ejerc3 {
//3. Crear una stack que permita objetos de tipo Autos, donde cada objeto auto debe tener: 
// num_patente, marca, modelo, color, chasis. Cargar la pila con 7 autos diferentes luego hacer lo siguiente:
//a.Buscar un auto de color rojo.
//b. Mostrar el auto que se encuentra en la cima de la pila.
//c.Borrar el auto que se encuentra en la cima de la pila.
//d.Agregar dos nuevos autos a la pila.
//Recorrer la pila mostrando el nuevo contenido luego de las operaciones realizadas.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Stack<String> pila=new Stack<>();

        System.out.println("===================================");
        System.out.println("esta pila esta vacia?: " + pila.isEmpty());

        pila.push("quw222,susjsjs,sjssh,sss");
        pila.push("auto2");
        pila.push("auto3");
        pila.push("auto4");
        pila.push("auto5");
        pila.push("auto6");
        pila.push("auto7");

        System.out.println("===================================");
        System.out.println("esta pila esta vacia?: " + pila.isEmpty());
        
        System.out.println("===================================");
        for (String pil :pila) {
            System.out.println("" + pila.search("auto4"));
        }

        System.out.println("===================================");
        System.out.println("  " + pila.peek());

        System.out.println("===================================");
        System.out.println("    " + pila.pop());

        System.out.println("===================================");
        pila.push("auto8");
        pila.push("auto9");

        System.out.println("===================================");
        for (String pil : pila) {
            System.out.println("  " + pil);
        }

    }

}
