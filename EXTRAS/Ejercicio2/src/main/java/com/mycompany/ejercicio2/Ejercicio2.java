/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import servicios.ServicioCine;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {
             ServicioCine serv = new ServicioCine();
        serv.crearSala();
//      serv.mostrarSala();
        serv.sentar();
        System.out.println("");
        serv.mostrarSala();
    }
    }

