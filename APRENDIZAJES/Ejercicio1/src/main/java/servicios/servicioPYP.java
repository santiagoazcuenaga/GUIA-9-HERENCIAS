/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class servicioPYP {

    static Scanner leer = new Scanner(System.in);
    ArrayList<Perro> perro = new ArrayList();
    ArrayList<Persona> persona = new ArrayList();

    public void registroPersona() {
  persona.add(new Persona("noelia", "gallo", 27, 46511315, null));
  persona.add(new Persona("fernando","lopez", 43 ,43645022,null));
        for (Persona persona1 : persona) {
            System.out.println(persona1);
        }
    }

    public Perro registroPerro() {
 perro.add(new Perro("jimi", "westie", "chico", 14));
    perro.add(new Perro("toto", "golden", "grande", 5));
        for (Perro perro1 : perro) {
            System.out.println(perro1);
        }
return null;


    }

    public void eleccionPerro() {
        
        Perro mascota = null;
        System.out.println("ingresa el nombre de la persona");
        String resp = leer.next();
        System.out.println("ingresa el nombre del perro a adoptar");
        String resp2 = leer.next();
        for (int i = 0; i < perro.size(); i++) {
            if (perro.get(i).getNombre().equalsIgnoreCase(resp2)) {
                mascota = perro.get(i);
            }
        }
        for (int i = 0; i < persona.size(); i++) {
            if (persona.get(i).getNombre().equalsIgnoreCase(resp)) {
                persona.get(i).setPerro1(mascota);
            }
        }
        for (int i = 0; i < perro.size(); i++) {
            if (perro.get(i).getNombre().equalsIgnoreCase(resp2)) {
                perro.remove(perro.get(i));
            }
        }
        
        
        for (Persona personic : persona) {
            System.out.println(personic);
        }
        for (Perro perro1 : perro) {
            System.out.println(perro1);
        }
    }
    public void menu (){
        
        
        System.out.println("BIENVENIDO A ADOPTA TU PERRO, POR FAVOR ELIJE UNA OPCION: ");
        System.out.println("OPCION 1: VER PERSONAS DISPONIBLES");
        System.out.println("OPCION 2: VER PERROS DISPONIBLES");
        System.out.println("OPCION 3: ASIGNE UN NUEVO DUEÑO PARA UN PERRITO");
        int Opcion = leer.nextInt();
        switch(Opcion){
            case 1:
                registroPersona();      
                menu();
            case 2:
                registroPerro();
            menu();
            case 3:
                eleccionPerro();
                System.out.println("desea agregar otro dueño?");
                String resp = leer.next();
                if (resp.equalsIgnoreCase("si")) {
                    eleccionPerro();
                }else{
                      menu(); 
                }
        }
        for (Persona personic : persona) {
            System.out.println(personic);
        }
        for (Perro perro1 : perro) {
            System.out.println(perro1);
        }
    }
    
    
    
}
