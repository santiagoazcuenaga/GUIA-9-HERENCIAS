/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Jugador;
import entidad.RevolverDeAgua;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServJugador {

public Jugador crearJugador (){
    
Scanner leer = new Scanner (System.in);
    System.out.println("ingrese el nombre del jugador");
    String nombre = leer.next();
    System.out.println("ingrese el id del jugador");
    int id = leer.nextInt();
    return new Jugador (id, nombre);
        
}
 public boolean cargar(RevolverDeAgua cs, Jugador b3){
     ServRevolverDeAgua b4 = new ServRevolverDeAgua();    
     if (b4.mojar(cs)) {
         b3.setMojado(true);
         
     }
    return b4.mojar(cs);
 }
 
 
 
 
}
