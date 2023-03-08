/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejejemplo;

import entidades.DNI;
import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjEjemplo {

    public static void main(String[] args) {
        Persona persona = new Persona();
        DNI dni = new DNI();
        Scanner leer = new Scanner (System.in);
        persona.setDni(dni);
        dni.setPersona(persona);
        dni.setNumero(43645021);
        System.out.println(dni.getNumero());
        dni.setNumeroserie(205);
        System.out.println(dni.getNumeroserie());
        
    }
}
