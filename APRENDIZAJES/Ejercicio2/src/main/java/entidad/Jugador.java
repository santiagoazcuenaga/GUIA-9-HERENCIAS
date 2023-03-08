/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class Jugador {
    private Integer ID;
    private String name;
    private Boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer ID, String name) {
        this.ID = ID;
        this.name = name+" "+ ID;
        this.mojado = false;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }
 
    
    
    
    @Override
    public String toString() {
        return "Jugador{" + "ID= " + ID + ", name= " + name + ", mojado= " + mojado + '}';
    }
    
}
