/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Concesionaria {
  private String nombreConcesionaria;
  private String dirección;

    public Concesionaria() {
    }

    public Concesionaria(String nombreConcesionaria, String dirección) {
        this.nombreConcesionaria = nombreConcesionaria;
        this.dirección = dirección;
    }

    public String getNombreConcesionaria() {
        return nombreConcesionaria;
    }

    public void setNombreConcesionaria(String nombreConcesionaria) {
        this.nombreConcesionaria = nombreConcesionaria;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    @Override
    public String toString() {
        return "NOMBRE DE CONCESIONARIA: " + this.getNombreConcesionaria() + "\n" + "DIRECCIÓN: " + this.getDirección() + "\n" ;
    }
  
  
}
