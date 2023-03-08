/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import entidad.Juego;
import entidad.Jugador;
import entidad.RevolverDeAgua;
import servicio.ServJuego;
import servicio.ServJugador;
import servicio.ServRevolverDeAgua;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        RevolverDeAgua ra = new RevolverDeAgua();
        Juego jug = new Juego();
        ServRevolverDeAgua ra1 = new ServRevolverDeAgua();
        ServJuego b1 = new ServJuego();
        Jugador b3 = new Jugador();
        ServJugador b2 = new ServJugador();
        
     
   
     b1.ronda();
        
    }
}
