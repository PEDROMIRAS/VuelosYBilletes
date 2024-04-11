
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vuelosybilletes;

import java.util.List;
import java.util.Scanner;

public class VuelosYBilletes {

    static Scanner scanner = new Scanner(System.in);
    static Agencia agencia = new Agencia();
    static Vuelo vuelo;
    static Cliente cliente = new Cliente();

    public static void main(String[] args) {
        while (true) {
            mostrarMenuPrincipal();
            int opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    menuAgencia();
                    break;
                case 2:
                    menuCliente();
                    break;
                case 3:
                    scanner.close();
                    System.out.println("Hasta luego!\n");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, introduzca una opción válida.\n");
            }

        }

    }

    public static void mostrarMenuPrincipal() {
        System.out.println("=== MENÚ PRINCIPAL ===");
        System.out.println("1. Agencia");
        System.out.println("2. Cliente");
        System.out.println("3. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    public static void menuAgencia() {
        while (true) {

            System.out.println("=== MENÚ AGENCIA ===");
            System.out.println("1. Crear vuelo");
            System.out.println("2. Devolver billete");
            System.out.println("3. Volver al menú principal\n");
            System.out.print("Seleccione una opción: \n");

            int opcionAgencia = scanner.nextInt();System.out.println("\n");

            switch (opcionAgencia) {
                case 1:
                    menuVuelo();
                    break;
                case 2:
                    menuDevolver();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }
        }
    }

    public static void menuVuelo() {
        String t;
        Vuelo v;
        CreadorVuelo miVuelo = new CreadorVueloConcreto("");
        while (true) {
            System.out.println("==== MENU VUELO ====");
            System.out.println("1.Tipo de avion");
            System.out.println("2.Volver\n");
            System.out.println("Seleccione una opcion:");

            int opcionVuelo = scanner.nextInt();System.out.println("\n");

            switch (opcionVuelo) {
                case 1:
                    System.out.println("Indique el tipo de avion para el vuelo:");
                    t = scanner.next();

                    miVuelo = new CreadorVueloConcreto(t);
                    v = miVuelo.crearVuelo();
                    v.datosVuelo();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    return;
            }
        }
    }

    public static void menuDevolver() {
    }

    public static void menuCliente() {
        while (true) {
            System.out.println("=== MENÚ CLIENTE ===");
            System.out.println("1. Comprar billete");
            System.out.println("2. Volver al menú principal\n");
            System.out.print("Seleccione una opción: ");

            int opcionCliente = scanner.nextInt();

            switch (opcionCliente) {

                case 1:
                    menuCompraBillete();
                    break;
                case 2:
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, introduzca una opción válida.\n");
                    return;

            }

        }
    }

    public static void menuCompraBillete() {
        System.out.println("Bienvenido a nuestro portal de venta de billetes");
        while (true) {
            System.out.println("==== VENTA VUELOS ====");
            System.out.println("1. Vuelo A318");
            System.out.println("2. Vuelo A319");
            System.out.println("3. Vuelo A320");
            System.out.println("4. Vuelo A321");
            System.out.println("5. Volver\n");
            System.out.println("Seleccione una opción:");

            int opcionBillete = scanner.nextInt();System.out.println("\n");
            switch (opcionBillete) {
                case 1:
                
                    System.out.println("Indique el numero de plazas que desea comprar: ");
                    int plazas318 = scanner.nextInt();System.out.println("\n");
                    VueloAirbusA318Factory vueloAirbusA318Factory = new VueloAirbusA318Factory();
                    Vuelo vueloAirbusA318 = vueloAirbusA318Factory.getVuelo();
                    cliente.comprarBillete(vueloAirbusA318, plazas318);
//esto no furula
                    List<Billete> billeteA318 = cliente.getBilletes();
                    for (Billete billete : billeteA318) {
                     System.out.println("Billete: " + billete.getTipoAvion()+" "+ billete.getNumPlazas() + " plazas");
}
                    break;

                case 2:
                    System.out.println("Indique el numero de plazas que desea comprar: ");
                    int plazas319 = scanner.nextInt();System.out.println("\n");
                    VueloAirbusA319Factory vueloAirbusA319Factory= new VueloAirbusA319Factory();
                    Vuelo vueloAirbusA319= vueloAirbusA319Factory.getVuelo();
                    cliente.comprarBillete(vueloAirbusA319, plazas319);

                    List<Billete> billeteA319 = cliente.getBilletes();
                    for (Billete billete : billeteA319){
                        System.out.println("Billete: " + billete.getTipoAvion()+" "+ billete.getNumPlazas() + " plazas");
}
                    break;

                case 3:
                    System.out.println("Indique el numero de plazas que desea comprar: ");
                    int plazas320 = scanner.nextInt();System.out.println("\n");
                    VueloAirbusA320Factory vueloAirbusA320Factory= new VueloAirbusA320Factory();
                    Vuelo vueloAirbusA320=vueloAirbusA320Factory.getVuelo();
                    cliente.comprarBillete(vueloAirbusA320, plazas320);
                    
                    List<Billete> billeteA320 = cliente.getBilletes();
                    for (Billete billete : billeteA320){
                        System.out.println("Billete: " + billete.getTipoAvion()+" "+ billete.getNumPlazas() + " plazas");
}
                    break;

                case 4:
                    System.out.println("Indique el numero de plazas que desea comprar: ");
                    int plazas321 = scanner.nextInt();System.out.println("\n");
                    VueloAirbusA321Factory vueloAirbusA321Factory= new VueloAirbusA321Factory();
                    Vuelo vueloAirbusA321= vueloAirbusA321Factory.getVuelo();
                    cliente.comprarBillete(vueloAirbusA321, plazas321);
                    
                    List<Billete> billeteA321 = cliente.getBilletes();
                    for (Billete billete : billeteA321){
                        System.out.println("Billete: " + billete.getTipoAvion()+" "+ billete.getNumPlazas() + " plazas");
}
                    break;

                case 5:
                    return;

            }
        }
    }
}
