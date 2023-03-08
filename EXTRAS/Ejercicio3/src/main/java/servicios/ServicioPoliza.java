/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Clientes;
import entidades.Polizas;
import entidades.Vehiculo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioPoliza {
     ArrayList<Polizas> polizas;
    private Scanner scan;
    ServicioClientes servCliente = new ServicioClientes();
    ServicioVehiculo servVehiculo = new ServicioVehiculo();
    ServicioCuota servCuo = new ServicioCuota();

    public ServicioPoliza() {
        polizas = new ArrayList();
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public void presioneTecla() {
        System.out.println("");
        System.out.println("Presione ENTER para continuar...");
        String letra = scan.next();
    }

    public Polizas crearPoliza() {
        Polizas pol = new Polizas();

        System.out.println("El numero de poliza se generará automaticamente..");
        presioneTecla();
        pol.setNumPoliza((int) (Math.random() * 1000) + 1);
        System.out.print("Se generó el numero de poliza: ");
        System.out.println(pol.getNumPoliza());
        pol.setFechaInicioyFin(LocalDate.now());
        System.out.println("Ingrese el periodo de cobertura en meses\n(se tomará el mismo valor para la cantidad de cuotas a abonar)");
        pol.setCantidadcuotas(scan.nextInt());
        pol.setFechafin(pol.getFechaInicioyFin().plusMonths(pol.getCantidadcuotas()));
        pol.setPlan(servCuo.generarPlan(pol.getCantidadcuotas()));
        System.out.println("SE MUESTRA EL PLAN DE PAGOS");
        servCuo.mostrarPlan(pol.getPlan());
        System.out.println("Elija y escriba la forma de pago de las siguientes opciones:");
        System.out.println("( EFECTIVO - TRANSFERENCIA - CHEQUE - DEBITO - CREDITO )");
        pol.setMetodopago(scan.next());
        System.out.println("Elija y escriba el tipo de cobertura de las siguientes opciones:");
        System.out.println("( OBLIGATORIO - TERCEROS - TERCEROS COMPLETOS - PARCIAL - TOTAL )");
        pol.setTipocobertura(scan.next());
        System.out.println("Defina el monto total asegurado para el vehiculo");
        pol.setMontoTotalAsegurado(scan.nextInt());
        System.out.println("Indique por SI o por NO si tendrá cobertura contra granizo");
        System.out.print("Respuesta: ");
        String res = scan.next();
        if (res.equalsIgnoreCase("SI")) {
            pol.setGranizo(Boolean.TRUE);
            System.out.println("Indique el monto de cobertura por granizo");
            pol.setMontogranizo(scan.nextInt());
        } else {
            pol.setGranizo(Boolean.FALSE);
        }
        System.out.println("");
        System.out.println("Se solicitarán los datos del cliente,\n primero se cheaquea si el mismo existe en nuestra base de datos");
        Clientes cliente = servCliente.buscarCliente();
        if (cliente == null) {
            cliente = servCliente.gestionIntegralClientes();
        } else {
            System.out.println("Cliente existente - Se asocia a la poliza");
            presioneTecla();
        }
        pol.setCliente(cliente);
        System.out.println("");
        System.out.println("Se solicitarán los datos del vehiculo,\n primero se cheaquea si el mismo existe en nuestra base de datos");
        Vehiculo ve = servVehiculo.buscarVehiculo();
        if (ve == null) {
            ve = servVehiculo.gestionDeVehiculos();
        } else {
            System.out.println("Vehiculo existente - Se asocia a la poliza");
            presioneTecla();
        }
        pol.setVehiculos(ve);
        System.out.println("");
        System.out.println("******* POLIZA CARGADA EXITOSAMENTE !!! *******");

        return pol;

    }

    public void modificarPoliza() {
        Polizas pol = buscarPoliza();
        if (pol == null) {
            System.out.println("La poliza NO existe");

        } else {
            System.out.println("Se modifica la poliza " + pol.getNumPoliza());
            presioneTecla();
            pol = crearPoliza();

        }
    }

    public void eliminarPoliza() {
        Polizas pol = buscarPoliza();
        if (pol == null) {
            System.out.println("La poliza NO existe");

        } else {
            System.out.println("Se elimina la poliza " + pol.getNumPoliza());
            presioneTecla();
            polizas.remove(pol);

        }
    }

    public Polizas buscarPoliza() {
        System.out.println("Ingrese el N° de poliza a buscar:");
        Integer n = scan.nextInt();
        for (Polizas poliza : polizas) {
            if (n.equals(poliza.getNumPoliza())) {
                return poliza;
            }
        }

        return null;
    }

    public void mostrarPolizas() {
        for (Polizas poliza : polizas) {
            System.out.println("");
            System.out.println(poliza);
            System.out.println("-----------------------------------------");

        }

    }

    public void mostrarPoliza() {
        Polizas pol = buscarPoliza();
        if (pol == null) {
            System.out.println("La poliza NO existe");

        } else {
            System.out.println(pol);

        }
    }

    public void menuPoliza() {
        System.out.println("-||||||- Gestion de Polizas -||||||-");
        System.out.println("");
        System.out.println("1. Crear Poliza");
        System.out.println("2. Modificar Poliza");
        System.out.println("3. Eliminar Poliza");
        System.out.println("4. Mostrar lista de Polizas");
        System.out.println("5. Mostrar Poliza especifica");
        System.out.println("6. Salir");
        System.out.println("");
        System.out.println("Ingrese una opción:");
        int op = scan.nextInt();
        switch (op) {
            case 1:
                Polizas pol = crearPoliza();
                polizas.add(pol);
                presioneTecla();
                menuPoliza();
                break;
            case 2:
                modificarPoliza();
                presioneTecla();
                menuPoliza();
                break;
            case 3:
                eliminarPoliza();
                presioneTecla();
                menuPoliza();
                break;
            case 4:
                mostrarPolizas();
                presioneTecla();
                menuPoliza();
                break;
            case 5:
                mostrarPoliza();
                presioneTecla();
                menuPoliza();

                break;
            case 6:
                break;
            default:
                menuPoliza();
                break;
        }
    }

    public void menu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("----------*** La Tercera Seguros ***----------");
            System.out.println("");
            System.out.println("1. Gestion de Clientes");
            System.out.println("2. Gestion de Vehiculos");
            System.out.println("3. Gestion de Polizas");
            System.out.println("4. Gestion de Cuotas");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Ingrese una opción:");
            int op = scan.nextInt();
            switch (op) {
                case 1:
                    servCliente.menuCliente();
                    break;
                case 2:
                    servVehiculo.menuVehiculo();
                    break;
                case 3:
                    menuPoliza();
                    break;
                case 4:
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta!!");
                    break;
            }
        }

    }
}
