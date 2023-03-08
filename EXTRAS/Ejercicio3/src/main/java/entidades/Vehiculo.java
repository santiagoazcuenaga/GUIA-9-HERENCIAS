/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Vehiculo {
 private int patente; 
private String marca;    
private String modelo;
private String color;
private int anio;
private String tipo;
private int numeromotor;
private String chasis;


    public Vehiculo() {
    }

    public Vehiculo(int patente,String marca,String modelo, String color, int anio, String tipo, int numeromotor, String chasis, Clientes cliente, ArrayList<Clientes> cl) {
        this.patente = patente;
        this.marca= marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.tipo = tipo;
        this.numeromotor = numeromotor;
        this.chasis = chasis;
       
        
       }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeromotor() {
        return numeromotor;
    }

    public void setNumeromotor(int numeromotor) {
        this.numeromotor = numeromotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", anio=" + anio + ", tipo=" + tipo + ", numeromotor=" + numeromotor + ", chasis=" + chasis + '}';
    }







    
   

    
}
