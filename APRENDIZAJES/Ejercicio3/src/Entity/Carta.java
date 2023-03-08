/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Objects;


/**
 * @author :D
 */

public class Carta {

    private Integer num;
    private String palo;

    public Carta() {
    }

    public Carta(Integer num, String palo) {
        this.num = num;
        this.palo = palo;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

   


    
    
    @Override
    public String toString() {
        return "Carta: " + num + " De " + palo;
    }

    
    
    

}//end
