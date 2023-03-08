/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Polizas {
private int numPoliza;
private LocalDate fechaInicioyFin;
private LocalDate fechafin;
private int cantidadcuotas;
private String metodopago;
private boolean granizo;
private int montogranizo;
private int montoTotalAsegurado;
private String tipocobertura;
private Clientes cliente;
private Vehiculo vehiculos;
    private TreeSet<Cuota> plan;  

    public Polizas() {
    }

    public Polizas(TreeSet <Cuota> plan,LocalDate fechafin,int numPoliza, LocalDate fechaInicioyFin, int cantidadcuotas, String metodopago, boolean granizo, int montogranizo, int montoTotalAsegurado, String tipocobertura, Clientes cliente, Vehiculo vehiculos) {
        this.plan = plan;
        this.fechafin = fechafin;
        this.numPoliza = numPoliza;
        this.fechaInicioyFin = fechaInicioyFin;
        this.cantidadcuotas = cantidadcuotas;
        this.metodopago = metodopago;
        this.granizo = granizo;
        this.montogranizo = montogranizo;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.tipocobertura = tipocobertura;
        this.cliente = cliente;
        this.vehiculos = vehiculos;
    }

    public TreeSet<Cuota> getPlan() {
        return plan;
    }

    public void setPlan(TreeSet<Cuota> plan) {
        this.plan = plan;
    }
    

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public int getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(int numPoliza) {
        this.numPoliza = numPoliza;
    }

    public LocalDate getFechaInicioyFin() {
        return fechaInicioyFin;
    }

    public void setFechaInicioyFin(LocalDate fechaInicioyFin) {
        this.fechaInicioyFin = fechaInicioyFin;
    }

    public int getCantidadcuotas() {
        return cantidadcuotas;
    }

    public void setCantidadcuotas(int cantidadcuotas) {
        this.cantidadcuotas = cantidadcuotas;
    }

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public int getMontogranizo() {
        return montogranizo;
    }

    public void setMontogranizo(int montogranizo) {
        this.montogranizo = montogranizo;
    }

    public int getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(int montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public String getTipocobertura() {
        return tipocobertura;
    }

    public void setTipocobertura(String tipocobertura) {
        this.tipocobertura = tipocobertura;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Polizas{" + "numPoliza=" + numPoliza + ", fechaInicioyFin=" + fechaInicioyFin.format(DateTimeFormatter.ofPattern("dd MMM yyyy")) + ", fechafin=" + fechafin.format(DateTimeFormatter.ofPattern("dd MMM yyyy")) + ", cantidadcuotas=" + cantidadcuotas + ", metodopago=" + metodopago + ", granizo=" + granizo + ", montogranizo=" + montogranizo + ", montoTotalAsegurado=" + montoTotalAsegurado + ", tipocobertura=" + tipocobertura + ", cliente=" + cliente + ", vehiculos=" + vehiculos + ", plan=" + plan + '}';
    }




}
