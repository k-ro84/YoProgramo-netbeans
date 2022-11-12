/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author bullaresinfo
 */
public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String dirección;
    private int celular;
    private int edad;

    public Persona() {
    }

    public Persona(int dni, String nombre, String apellido, String dirección, int celular, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dirección = dirección;
        this.celular = celular;
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDirección() {
        return dirección;
    }

    public int getCelular() {
        return celular;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direcci\u00f3n=" + dirección + ", celular=" + celular + ", edad=" + edad + '}';
    }

    
}
