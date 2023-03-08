/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class RevolverDeAgua {
    private Integer posActual;
    private Integer posAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posActual, Integer posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public Integer getPosActual() {
        return posActual;
    }

    public void setPosActual(Integer posActual) {
        this.posActual = posActual;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "revolver de agua{" + "posición Actual = " + posActual + ", posición del agua = " + posAgua + '}';
    }
    
}
