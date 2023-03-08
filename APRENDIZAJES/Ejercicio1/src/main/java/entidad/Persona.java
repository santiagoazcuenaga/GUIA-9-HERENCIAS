/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer edad;
    private Perro perro1;
    
private ArrayList<Perro> perro;  

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer dni, Integer edad,Perro perro1) {
        this.perro1 = perro1;
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.perro = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public ArrayList<Perro> getPerro() {
        return perro;
    }

    public void setPerro(ArrayList<Perro> perro) {
        this.perro = perro;
    }

    public Perro getPerro1() {
        return perro1;
    }

    public void setPerro1(Perro perro1) {
        this.perro1 = perro1;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad + ", perro=" + perro1 +'}';
    }

    

    


}
