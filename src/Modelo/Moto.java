/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Moto extends Auto{

    public Moto() {
    }

    public Moto(String marca, String modelo, String color, double precio, String nombreConcesionaria, String dirección) {
        super(marca, modelo, color, precio, nombreConcesionaria, dirección);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
