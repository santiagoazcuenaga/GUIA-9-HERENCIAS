/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Clientes;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class ServicioClientes {
   
    
ArrayList<Clientes> cliente = new ArrayList();

   

 static Scanner leer = new Scanner (System.in);   
    

      
public Clientes gestionIntegralClientes(){
    
     Clientes cl = new Clientes();
    
        System.out.println("BIENVENIDO AL REGISTRO DE CLIENTES");
    System.out.println("-------------------------------------");
      System.out.println("-------------------------------------");
    System.out.println("INGRESE SU NOMBRE:");
    cl.setNombre(leer.next());
    System.out.println("INGRESE SU APELLIDO: ");
    cl.setApellido(leer.next());
    System.out.println("INGRESE SU DNI");
    cl.setDni(leer.nextInt());
    System.out.println("INGRESE SU DIRECCION");
cl.setDireccion(leer.next());
    System.out.println("INGRESE SU MAIL");
cl.setEmail(leer.next());
    System.out.println("INGRESE SU TELEFONO");
cl.setTelefono(leer.nextInt());
cliente.add(cl);
         
 return cl;     
}    

public Clientes buscarCliente(){
    System.out.println("INGRESE EL DNI DEL CLIENTE A BUSCAR");  
    long dni = leer.nextLong();
    for (Clientes clientes : cliente) {
        if (dni == clientes.getDni()) {
            return clientes;
        }
    }
    
    
 return null;   
} 
 public void modificarCliente() {
        Clientes clientecito = buscarCliente();
        if (cliente == null) {
            System.out.println("El cliente no existe");
        } else {
            System.out.println("Ingrese nuevo nombre del cliente");
            clientecito.setNombre(leer.next());
            System.out.println("Ingrese nuevo apellido del cliente");
            clientecito.setApellido(leer.next());
            System.out.println("Ingrese nuevo DNI del cliente");
            clientecito.setDni(leer.nextInt());
            System.out.println("Ingrese nuevo mail del cliente");
            clientecito.setEmail(leer.next());
            System.out.println("Ingrese nuevo domicilio del cliente");
            clientecito.setDireccion(leer.next());
            System.out.println("Ingrese nuevo telefono del cliente");
            clientecito.setTelefono(leer.nextInt());

        }
    }

public void eliminarCliente(){
  Clientes clientes = buscarCliente();
    if (clientes == null) {
        System.out.println("NO SE HA ENCONTRADO CLIENTE");
    }else{
        cliente.remove(clientes);
    }
  
    
    
    
}

public void mostrarCliente(){
    Clientes clientes = buscarCliente();
    if (clientes == null) {
        System.out.println("EL CLIENTE NO EXISTE");
    }else{
        System.out.println(clientes);
    }
      
}
public void listaClientes(){
    for (Clientes clientess : cliente) {
            System.out.println(clientess);
        }
}
  public void presioneTecla(){
          System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra =leer.next();
    }
   public void menuCliente() {
        boolean salir = false;
        while (!salir) {
            System.out.println("----------Gestion de Clientes existentes----------");
            System.out.println("");
            System.out.println("1. Modificar Cliente");
            System.out.println("2. Eliminar Cliente");
            System.out.println("3. Mostrar lista de Clientes");
            System.out.println("4. Mostrar cliente especifico");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Ingrese una opción:");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    modificarCliente();
                     presioneTecla();
                    break;
                case 2:
                    eliminarCliente();
                     presioneTecla();
                    break;
                case 3:
                    mostrarCliente();
                    presioneTecla();
                    break;
                case 4:
                    
                    mostrarCliente();
                    presioneTecla();
                    break;
                case 5:
                   
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta!!");
                
            }
        }

    }
  
  

}
