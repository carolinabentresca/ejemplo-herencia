/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconcesionaria;

import Modelo.Auto;
import Modelo.Moto;

public class ProyectoConcesionaria {
 
    public static void main(String[] args) {
      Auto auto = new Auto();
      auto.setMarca("Volkswagen");
      auto.setModelo("Gol Trend");
      auto.setColor("Blanco");
      auto.setPrecio(1.260000);
      auto.setNombreConcesionaria("AutosCosmikos");
      auto.setDirección("Avellaneda 4546, Capital Federal");
      System.out.println("*****VENTA AUTO*****");
      System.out.println(auto.toString());
      System.out.println();
      
      Moto moto = new Moto();
      moto.setMarca("Zanella");
      moto.setModelo("ZB 110Lt Base");
      moto.setColor("Negra y Azul");
      moto.setPrecio(96.340);
      moto.setNombreConcesionaria("MotosFull");
      moto.setDirección("Chile 3333, San Justo");
      System.out.println("*****VENTA MOTO*****");
      System.out.println(moto.toString());
      System.out.println();
      
      Auto auto1 = new Auto();
      auto1.setMarca("Fiat");
      auto1.setModelo("Mobi");
      auto1.setColor("Negro");
      auto1.setPrecio(1.625000);
      auto1.setNombreConcesionaria("AutosRapp");
      auto1.setDirección("Independencia 1156, Capital Federal");
      System.out.println("*****VENTA AUTO*****");
      System.out.println(auto1.toString());
      System.out.println();
      
      Moto moto1 = new Moto();
      moto1.setMarca("Gilera");
      moto1.setModelo("Smash Full R 110");
      moto1.setColor("Azul");
      moto1.setPrecio(117.190);
      moto1.setNombreConcesionaria("MotozOk");
      moto1.setDirección("Rivadavia 17540, Morón");
      System.out.println("*****VENTA MOTO*****");
      System.out.println(moto1.toString());
      System.out.println();
    }
    
}
