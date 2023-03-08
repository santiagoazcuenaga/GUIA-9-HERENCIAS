/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.RevolverDeAgua;

/**
 *
 * @author Usuario
 */
public class ServRevolverDeAgua {
    
    
    public void llenarRevolver(RevolverDeAgua cs){
        int posActual =(int) (Math.random()*6)+1;
        int posAgua = (int) (Math.random()*6)+1;
        cs.setPosActual(posActual);
        cs.setPosAgua(posAgua);
        
    
      
    }
    
    public boolean mojar(RevolverDeAgua cs){
      
     return cs.getPosActual() == cs.getPosAgua();   
    }
    
   public void siguienteChorro(RevolverDeAgua cs){
      
      
       if(cs.getPosActual() == 6){
           cs.setPosActual(1);
       }else{
           
       cs.setPosActual(cs.getPosActual() + 1);
       }       
       
       
   }
   
   
   
   
}
