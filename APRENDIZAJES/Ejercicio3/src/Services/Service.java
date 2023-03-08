/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entity.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author :D
 * 
 */
public class Service {

    Scanner scan = new Scanner(System.in);
    ArrayList<Carta> bastos;
    ArrayList<Carta> espadas;
    ArrayList<Carta> oros;
    ArrayList<Carta> copas;
    ArrayList<Carta> mazo;
HashSet<Carta> mazoMonton;
    public Service() {
        this.bastos = new ArrayList();
        this.espadas = new ArrayList();
        this.oros = new ArrayList();
        this.copas = new ArrayList();
        this.mazo = new ArrayList();
        this.mazoMonton = new HashSet();
    }

    public void crearCartas() {

        for (int i = 1; i <= 12; i++) {
            if (i == 8 || i == 9) {

            } else {
                //Carta  CAR = new Carta
                bastos.add(new Carta(i, "bastos"));
                espadas.add(new Carta(i, "espadas"));
                oros.add(new Carta(i, "oros"));
                copas.add(new Carta(i, "copas"));

            }
        }
        
        mazo.addAll(copas);
        mazo.addAll(bastos);
        mazo.addAll(espadas);
        mazo.addAll(oros);

    }
    public void reordenarCartas(){
        mazo.removeAll(copas);
         mazo.removeAll(bastos);
          mazo.removeAll(espadas);
           mazo.removeAll(oros);
           crearCartas();
        
      
    }

    public void mostrar() {
        
        for (Carta carta : mazo) {
            System.out.println(carta);

        }
    }

    public void barajar() {
        for (int i = 0; i < 10; i++) {
               Collections.shuffle(mazo);

        }
  
     
    }

    public void siguienteCarta() {
      
        
        mazoMonton.add(mazo.get(0));
        System.out.println(mazo.get(0));
        mazo.remove(0);
        
    }
    public void cartasDisponibles(){
        System.out.println("las cartas disponibles son:  "+ mazo.size());
        
    }
    public void darCartas(){
        System.out.println("cuantas cartas quiere pedir?");
        int resp = scan.nextInt();
        if (resp > mazo.size()) {
            System.out.println("no tenemos esa cantidad disponible");
            
        }else{
            for (int i = 0; i < resp; i++) {
                siguienteCarta();
            }
            System.out.println("te dimos "+resp+" cartas ");
            
        }
       
        
    }
    public void cartasMonton(){
        if (mazoMonton.size() == 0) {
            System.out.println("no ha salido ninguna carta");
        }else{
            for (Carta mazoMonton : mazoMonton) {
                System.out.println(mazoMonton);
            }
            
        }
        
        
    }
    
    public void menu(){
        crearCartas();
        boolean salir = false;
        while(!salir){
            
         for (int i = 0; i < 5; i++) {
                System.out.println("");
            }
        System.out.println("BIENVENIDO AL MENU");
        System.out.println("INGRESE UNA OPCION NUMERAL");
        System.out.println("OPCION 1: DAR CARTAS");
        System.out.println("OPCION 2: MOSTRAR TUS CARTAS");
        System.out.println("OPCION 3: MOSTRAR LA BARAJA");
        System.out.println("OPCION 4: MEZCLAR");
        System.out.println("OPCION 5: REORDENAR");
        System.out.println("OPCION 6: CARTAS DISPONIBLES");
        System.out.println("OPCION 7: SALIR");
           
        int op = scan.nextInt();
        switch(op){
            case 1:
                darCartas();
                break;
            case 2:    
            cartasMonton();
            break;
            case 3:
            mostrar();
            break;
            case 4:
            barajar();
            break;
            case 5:
                reordenarCartas();
              break;
            case 6:
                cartasDisponibles();
                break;
            case 7:
                salir = true;
                break;
            default:
                System.out.println("opcion invalida, vuelve a intentarlo");
        }
        
        } 
        
    }
    
    
    
    
}//end
