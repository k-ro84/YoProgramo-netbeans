/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author c.olguin
 */
public class ejerc3 {
//3.Realizar una clase de Excepciones Personalizada que extienda de la clase Exception. 
//Implementar los diferentes métodos que sean necesarios teniendo en cuenta cada uno de los mensajes personalizados 
//que podrían arrojar. Provocar la ejecución de la excepción personalizada mediante la sentencia throw 
//para probar la ejecución de la excepción y responder… ¿Se ejecuta correctamente? ¿Qué método de la excepción se ejecutó?

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MiException {
        // TODO code application logic here
          crearPersona();
    }   
    //Podemos implementar un programa más robusto si capturamos la excepción InputMismatchException 
    //y le informamos al usuario que debe ingresar un dato obligatoriamente.
    
        public static void crearPersona() {
             try {
              ingresarDatos();
            } catch ( MiException|InputMismatchException ex) {
                System.out.println(ex.getMessage());
                 crearPersona();
                 // aca le digo que si ocurre una exception la quiero ver con el crear dento le digo que quiero 
                 //forzar al metodo a pedirla, y agrego el input para ingrese un dato de valor requerido como un int
            }
           
        }
        
        public static void ingresarDatos() throws MiException, InputMismatchException {
        
            Scanner leer = new Scanner(System.in).useDelimiter("\n");

            System.out.println("ingrese su nombre completo : ");
            String nombre = leer.next();

            if (nombre.length() < 2) {
                throw new MiException("ups, creo que faltaron letras ");

            }
            System.out.println("ingrese su edad : ");
            int edad = leer.nextInt();

            if (edad < 0) {
                throw new MiException("no ingreso una edad valida  ");

            }

            System.out.println("""
                               los datos ingresados son ---> 
                                nombre :""" + nombre.toUpperCase()
                    + "\n y su edad es : " + edad);

        }
        // prueba de lectura de archivos txt en java       
//        public static void main(String[] args) throws FileNotFoundException {
//        // TODO code application logic here
//        
//      try{
//        File archivo=new File("C:\\Users\\bullaresinfo\\Desktop\\hola.txt");
//        Scanner leer = new Scanner(archivo);
//        leer.useDelimiter("\\Z");
//        System.out.println(leer.next());
//           
//        }catch(FileNotFoundException y){
//            System.out.println("Error:" + y.getMessage()); 
//           
//        }finally{
//           System.out.println("Saliendo del try");  
//        }


}
