/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;


import entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioVehiculo {
    //Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
//modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
    static Scanner leer = new Scanner(System.in);
    ArrayList <Vehiculo> vehiculo = new ArrayList();
    
    
  public Vehiculo gestionDeVehiculos(){
     
      Vehiculo vc = new Vehiculo();
      
          System.out.println("BEINVENIDO AL REGISTRO DE SU VEHICULO");   
      System.out.println("-------------------------------------");
      System.out.println("-------------------------------------");
      
      System.out.println("INGRESE EL MODELO DEL VEHICULO");
      vc.setModelo(leer.next());
      System.out.println("INGRESE EL AÑO DEL VEHICULO");
      vc.setAnio(leer.nextInt());
      System.out.println("INGRESE LA PATENTE DEL VEHICULO");
      vc.setPatente(leer.nextInt());
      System.out.println("INGRESE EL NUMERO DEL MOTOR");
      vc.setNumeromotor(leer.nextInt());
      System.out.println("INGRESE EL CHASIS");
      vc.setChasis(leer.next());
      System.out.println("INGRESE EL COLOR");
      vc.setColor(leer.next());
      System.out.println("INGRESE EL TIPO DE VEHICULO");
      vc.setTipo(leer.next());
      vehiculo.add(vc);
      
    
   return vc; 
  } 
  public void modificarVehiculo() {
        Vehiculo ve = buscarVehiculo();
        if (ve == null) {
            System.out.println("El vehiculo no existe");
        } else {
            System.out.println("Ingrese la Patente del vehiculo:");
            ve.setPatente(leer.nextInt());
            System.out.println("Ingrese la Marca del vehiculo:");
            ve.setMarca(leer.next());
            System.out.println("Ingrese el Modelo del vehiculo:");
            ve.setModelo(leer.next());
            System.out.println("Ingrese el anio del vehiculo:");
            ve.setAnio(leer.nextInt());
            System.out.println("Ingrese el N° del motor del vehiculo:");
            ve.setNumeromotor(leer.nextInt());
            System.out.println("Ingrese el N° del chasis del vehiculo:");
            ve.setChasis(leer.next());
            System.out.println("Ingrese el color del vehiculo:");
            ve.setColor(leer.next());
            System.out.println("Ingrese el tipo del vehiculo:");
            ve.setTipo(leer.next());
        }
    }

    public void eliminarVehiculo() {
        Vehiculo ve = buscarVehiculo();
        if (ve == null) {
            System.out.println("El vehiculo no existe");
        } else {
            vehiculo.remove(ve);
        }

    }

    public Vehiculo buscarVehiculo() {
        System.out.println("Ingrese la patente del vehiculo");
        String pat = leer.next();
        for (Vehiculo vehiculoss : vehiculo) {
            if (pat.equals(vehiculoss.getChasis())) {
                return vehiculoss;
            }
        }
        return null;
    }

    public void mostrarVehiculo() {
        Vehiculo ve = buscarVehiculo();
        if (ve == null) {
            System.out.println("El vehiculo no existe");
        } else {
            System.out.println(ve);
        }

    }

    public void mostrarVehiculos() {
        if (vehiculo.isEmpty()) {
            System.out.println("Lista de Vehiculos vacia!");
        } else {
            for (Vehiculo ve : vehiculo) {
                System.out.println(ve);
            }
        }

    }
public void presioneTecla(){
          System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra =leer.next();
    }
    public void menuVehiculo() {
       
            System.out.println("-||||||- Gestion de Vehiculos existentes-||||||-");
            System.out.println("");
            System.out.println("1. Modificar Vehiculo");
            System.out.println("2. Eliminar Vehiculo");
            System.out.println("3. Mostrar lista de Vehiculos");
            System.out.println("4. Mostrar vehiculo especifico");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Ingrese una opción:");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    modificarVehiculo();
                     presioneTecla();
                    menuVehiculo();
                    break;
                case 2:
                    eliminarVehiculo();
                     presioneTecla();
                    menuVehiculo();
                    break;
                case 3:
                    mostrarVehiculos();
                    presioneTecla();
                    menuVehiculo();
                    break;
                case 4:
                    
                    mostrarVehiculo();
                    presioneTecla();
                    menuVehiculo();
                    break;
                case 5:
                   
                    
                    break;
                default:
                    System.out.println("Opcion incorrecta!!");
                menuVehiculo();
                break;
            }
        

    

    }

    
    
}
