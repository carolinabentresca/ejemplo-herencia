/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Auto extends Concesionaria {
    private String marca;
    private String modelo;
    private String color;
    private double precio;

    public Auto() {
    }

    public Auto(String marca, String modelo, String color, double precio, String nombreConcesionaria, String dirección) {
        super(nombreConcesionaria, dirección);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  super.toString() + "MARCA: " + this.getMarca() + "\n" + "MODELO: " + this.getModelo() + "\n" + "COLOR: " + this.getColor() + "\n" + "PRECIO: " + this.getPrecio() + "\n";
    }
    
}
