/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author c.olguin
 */
public class ejerc2 {
//2. Crear una clase persona que tenga los siguientes atributos: dni, nombre, apellido, dirección, celular, edad
//(tener en cuenta todos sus atributos,constructores y métodos getters y setters). A partir de ello:
//a.Crear una LinkedList de tipo Persona y agregar 20 personas distintas.
//b.Crear dos LinkedLists de tipo Persona diferentes a la primera, una para almacenar a los menores de edad 
//y otra para los mayores.
//c.Recorrer la lista principal buscando a las personas que sean mayores de 18 años.En caso que una persona tenga o sea mayor
//a 18 años, agregarla a la lista de mayores,caso contrario agregarla a una lista de menores.
//d. Una vez realizada la separación, recorrer ambas nuevas listas y mostrar por pantalla el nombre, 
//apellido y edad de cada una de las personas contenidas en cada lista.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        List<Persona> listaPersonas = new LinkedList<Persona>();
        int dni, celular, edad;
        String nombre, apellido, dirección;

        listaPersonas.add(new Persona(12020201, "gabriel", "gomez", "calle barcala 222", 02612222222, 66));
        listaPersonas.add(new Persona(33030225, "Lucy", "sanchez", "calle tilo 243", 0261333333, 30));
        listaPersonas.add(new Persona(40393822, "Guillermo", "pol", "avenida maraton 1223", 0261444444, 23));
        listaPersonas.add(new Persona(36362523, "Luisina", "perez", "calle mitre 670", 0261555555, 25));
        listaPersonas.add(new Persona(27589790, "delia", "campos", "calle centro 900", 0261666666, 40));
        listaPersonas.add(new Persona(24348262, "elida", "benitez", "calle cabildo 232", 0261777777, 58));
        listaPersonas.add(new Persona(48810133, "ramon", "ledesma", "calle portal 578", 0261000111, 16));
        listaPersonas.add(new Persona(25351361, "hector", "bergonzi", "avenida solar 333", 0261555555, 55));
        listaPersonas.add(new Persona(27234905, "ana", "batalla", "calle telmo 454", 0261555555, 52));
        listaPersonas.add(new Persona(26639142, "ines", "quinteros", "calle reconquista 200", 0261555555, 54));
        listaPersonas.add(new Persona(17880256, "juan", "ramirez", "calle primavera 450", 0261555555, 64));
        listaPersonas.add(new Persona(21971438, "silvina", "fierro", "calle tilos 900", 0261555555, 42));
        listaPersonas.add(new Persona(35648772, "laura", "rosales", "ccalle españa 677", 0261555555, 35));
        listaPersonas.add(new Persona(34790576, "maria", "ferro", "calle italia 232", 0261555555, 34));
        listaPersonas.add(new Persona(28413776, "pedro", "varela", "pasadizo 34 201", 0261555555, 49));
        listaPersonas.add(new Persona(16104503, "lucia", "olivera", "calle estrella 780", 0261555555, 60));
        listaPersonas.add(new Persona(13755489, "fernanda", "olivera", "calle fierro 223", 0261555555, 65));
        listaPersonas.add(new Persona(22660560, "ariel", "torres", "calle belgrano 700", 0261555555, 50));
        listaPersonas.add(new Persona(47004533, "juan pablo ", "miranda", "calle victoria 612", 0261555555, 17));
        listaPersonas.add(new Persona(34677252, "alejandra", "benitez", "calle puntilla 456", 0261555555, 26));
        
        
        System.out.println("===================================");
        System.out.println("imprimo las personas");
        System.out.println("En la lista hay: " + listaPersonas.size() + " personas registradas");

        listaPersonas.add(new Persona(34677244, "alejandro", "lopez", "calle suipacha 560",0261223333, 31));

        System.out.println("===================================");
        System.out.println("Recorremos la lista con un iterator");

        Iterator<Persona> it = listaPersonas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        
        System.out.println("===================================");
        for (Persona pers :listaPersonas) {
            if (pers.getEdad()>18) {
                System.out.println("persona mayor de 18 años : " + pers.getEdad());
            }else{
                System.out.println("persona menor de 18 años : " + pers.getEdad());
            }
        }
        
         System.out.println("===================================");
        for (Persona pers :listaPersonas) {
            if (pers.getEdad()>18) {
                System.out.println("persona mayor de 18 años : " + pers.getEdad());
            }
        }
        
         System.out.println("===================================");
        for (Persona pers :listaPersonas) {
            if (pers.getEdad()<18) {
                 System.out.println("persona menor de 18 años : " + pers.getEdad());
            }
        }
        
        
          System.out.println("===================================");
        for (Persona pers :listaPersonas) {
            System.out.println("planilla de personas ------> nombre : "+ pers.getNombre() + 
                    " apellido : " + pers.getApellido() +
                    " edad : " + pers.getEdad() + " años");
        }
        
        
        System.out.println("===================================");
        Collections.sort(listaPersonas, 
                (Persona p1, Persona p2) -> Integer.valueOf(p2.getEdad()).compareTo(p1.getEdad()) 
        // Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
        );
        
        
    }

}
