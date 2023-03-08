/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Juego;
import entidad.Jugador;
import entidad.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServJuego {
    private ArrayList <Jugador> jugadores;
ServJugador b10 ;
ServRevolverDeAgua b11;

    public ServJuego() {
    this.jugadores = new ArrayList();
    this.b11  = new ServRevolverDeAgua();
this.b10 = new ServJugador();
    }
    
 public void llenarJugadores(){
     Scanner leer = new Scanner (System.in);
     ServJugador b5 = new ServJugador();
     System.out.println("Ingrese la cantidad de jugadores: ");
     
     int cantJug = leer.nextInt();
     if (cantJug > 6) {
         cantJug = 6;
     }
         for (int i = 0; i < cantJug; i++) {
         jugadores.add(b5.crearJugador());
             System.out.println(jugadores.get(i));
             
         }
 
         
         
         
     
     
 } 
 
 public void llenarJuego(RevolverDeAgua b6,Juego b7 ){
     llenarJugadores();
     
     b7.setJugadores(jugadores);
     b7.setRevolver(b6);
     
     
     
 }
 
 public void ronda(){
  
  RevolverDeAgua b12 = new RevolverDeAgua();
  Juego juego = new Juego ();
  b11.llenarRevolver(b12);
  llenarJuego(b12,juego);      
     
boolean todosVivos = true;
int ronda = 1;
     do {
         System.out.println("");
         System.out.println("Ronda :"+ronda);
         for (int i = 0; i < jugadores.size(); i++) {
             if (b10.cargar(b12, jugadores.get(i))) {
                 System.out.println(jugadores.get(i).getName()+ " ha muerto" );
                 todosVivos= false;
                 
             }
             b11.siguienteChorro(b12);
         }
         if (todosVivos) {
             System.out.println("Todos los jugadores estan secos");
             ronda++;
         }
         
         
     } while (todosVivos);
     System.out.println("");
     System.out.println("gracias por jugar!");
 }
 }
    

