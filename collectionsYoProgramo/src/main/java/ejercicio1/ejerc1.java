/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author c.olguin
 */
public class ejerc1 {
//1. Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje y raza 
//(tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir de ello:
//a.      Crear un ArrayList de tipo Mascota. Crear 5 mascotas y guardarlas en la lista.
//b.      Recorrer la lista creada y mostrar por pantalla el nombre, especie y pelaje de las mascotas almacenadas.
//c.       Durante el recorrido, cambiar el nombre de dos mascotas. Volver a recorrer la lista y mostrar los nuevos datos
//d.      Agregar dos nuevas mascotas a la lista.
//e.      Recorrer la lista pero solo mostrando las mascotas que sean de la especie “perro”.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        List<Mascota> listaMascota = new ArrayList<Mascota>();

        String nombre, especie, sexo, color, pelaje, raza;
 
        
        listaMascota.add(new Mascota("lolo", "felino", "masc", "marron", "corto", "gato"));
        listaMascota.add(new Mascota("sam", "felina", "fem", "gris", "largo ", " gata"));
        listaMascota.add(new Mascota("tina", "canina", "fem", "caramelo", " largo", " perra"));
        listaMascota.add(new Mascota("thor", "canino", "masc", "negro", " corto", " perro"));
        listaMascota.add(new Mascota("pull", "canino", "masc", "gris", " corto", "perro"));

        System.out.println("En la lista hay: " + listaMascota.size());
        
        System.out.println("===================================");
        for (Mascota masc : listaMascota) {
            System.out.println(" nombre "  + masc.getNombre()
                    + " especie " + masc.getEspecie()
                    + " sexo " + masc.getSexo()
                    + " color " + masc.getColor()
                    + " pelaje " + masc.getPelaje()
                    + " raza " + masc.getRaza());
        }
        System.out.println("mostramos ");
        for (Mascota masc : listaMascota) {
            System.out.println(" nombre " + masc.getNombre()
                    + " especie " + masc.getEspecie()
                    + " pelaje " + masc.getPelaje());
        }
        System.out.println("===================================");
        System.out.println("edicion de elementos");
         listaMascota.get(0).setNombre("fino");
         listaMascota.get(3).setEspecie("felino");
        
          System.out.println("mostramos ");
        for (Mascota masc : listaMascota) {
            System.out.println("nombre " + masc.getNombre()
                    + " especie "  + masc.getEspecie()
                    + " pelaje " + masc.getPelaje());
        }
         
         
        System.out.println("===================================");
        System.out.println("Eliminamos un elemento mediante el indice");

        listaMascota.remove(1); // Removemos un elemento con su indice

        System.out.println("mostramos solo el nombre,especie y pelaje");
        for (Mascota masc : listaMascota) {
            System.out.println("nombre " + masc.getNombre()
                    + " especie " + masc.getEspecie()
                    + " pelaje " + masc.getPelaje());
        }
     
        System.out.println("===================================");
        System.out.println("ingresamos dos nuevos elementos: ");
        //Opcion 2 - Recorrer la Lista y ver los id de objetos
        //el primero de los ingresos le decimos lo ingrese al principio de la lista, por eso "0" new
        listaMascota.add(0,new Mascota("tom", "felino", "masc", "gris", "largo", "gato"));
        listaMascota.add(new Mascota("mecha", "canina", "fem", "blanca", "largo ", " gata"));
        
        System.out.println("Recorriendo la lista y mostrar objetos ********************");
        for (int i = 0; i < listaMascota.size(); i++) {
            System.out.println("mascota: " + listaMascota.get(i));
        }

        System.out.println("===================================");
        System.out.println("mostar solo los elementos perro");
         for (Mascota masc : listaMascota) {
             System.out.println(""  + masc.getRaza().contains(new String ("perro")));            
        }
      
        
        System.out.println("===================================");
            System.out.println("Borramos todos los elementos de la lista");
            listaMascota.clear();
    
       System.out.println("Fin**************************************************************");
    }
}
