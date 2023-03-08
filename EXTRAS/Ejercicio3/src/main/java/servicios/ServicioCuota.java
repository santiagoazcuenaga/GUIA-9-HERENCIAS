/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cuota;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class ServicioCuota {
        public  TreeSet<Cuota> generarPlan(Integer cant){
        Scanner scan = new Scanner(System.in);
        System.out.println("Indique el monto total a abonar por la poliza");
        Float monto = scan.nextFloat();
        TreeSet<Cuota> plan = new TreeSet(); 
        for (int i = 1; i < cant+1; i++) {
            Cuota cuo = new Cuota();
            cuo.setNumero(i);
            cuo.setMonto(monto/cant);
            LocalDate fecha = LocalDate.now();
            cuo.setVence(fecha.plusMonths(i));
           plan.add(cuo);
        }
        return plan;
      
        }
    public void mostrarPlan(TreeSet<Cuota> plan){
        for (Cuota cuota : plan) {
            System.out.println(cuota);
            
        }
    }
    
}
