/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author bullaresinfo
 */
public class Auto {
    private int num_patente;
    private String marca;
    private String modelo;
    private String color;
    private String chasis;

    public Auto() {
    }

    public Auto(int num_patente, String marca, String modelo, String color, String chasis) {
        this.num_patente = num_patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.chasis = chasis;
    }

    public int getNum_patente() {
        return num_patente;
    }

    public void setNum_patente(int num_patente) {
        this.num_patente = num_patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    @Override
    public String toString() {
        return "Auto{" + "num_patente=" + num_patente + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", chasis=" + chasis + '}';
    }
    
    
}  
