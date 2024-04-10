
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vuelosybilletes;

import java.util.Scanner;

public class VuelosYBilletes {

    static Scanner scanner = new Scanner(System.in);
    static Agencia agencia = new Agencia();
    static Vuelo vuelo;
    static Cliente cliente = new Cliente("");

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

            int opcionAgencia = scanner.nextInt();

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
        while (true) {
            System.out.println("==== MENU VUELO ====");
            System.out.println("1.Tipo de acion");
            System.out.println("2.Volver\n");
            System.out.println("Seleccione una opcion:");

            int opcionVuelo =scanner.nextInt();

            switch (opcionVuelo) {
                case 1:
                    String t;
                    Vuelo v;
                    System.out.println("Indique el tipo de avion para el vuelo:");
                    t=scanner.nextLine();

                    CreadorVuelo miVuelo=new CreadorVueloConcreto(t);
                    v=miVuelo.crearVuelo();
                    v.datosVuelo();
                    break;
                case 2:
                    return;

                default:
                    break;
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

            }

        }
    }

    public static void menuCompraBillete() {
        System.out.println("Bienvenido a nuestro portal de venta de billetes");
        System.out.println("Introduzca su nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre + "!");

        while (true) {
            System.out.println("==== VENTA VUELOS ====");
            System.out.println("1. Vuelo A318");
            System.out.println("2. Vuelo A319");
            System.out.println("3. Vuelo A320");
            System.out.println("4. Vuelo A321");
            System.out.println("5. Volver\n");
            System.out.println("Seleccione una opción:\n ");

            int opcionBillete = scanner.nextInt();
            int id=scanner.nextInt();
            switch (opcionBillete) {
                case 1:
                    System.out.println("Indique el numero de plazas que desea comprar: ");
                    int plazas318 = scanner.nextInt();
                    VueloAirbusA318Factory vueloA318 = new VueloAirbusA318Factory(id, nombre, plazas318);
                    cliente.comprarBillete(cliente, vueloA318, plazas318);
                    break;

                case 2:
                    System.out.println("Indique el numero de plazas que desea comprar: ");
                    int plazas319 = scanner.nextInt();
                    VueloAirbusA319Factory vueloA319 = new VueloAirbusA319Factory(id, nombre, plazas319);
                    cliente.comprarBillete(cliente, vueloA319, plazas319);
                    break;

                case 3:
                    System.out.println("Indique el numero de plazas que desea comprar: ");
                    int plazas320 = scanner.nextInt();
                    VueloAirbusA320Factory vueloA320 = new VueloAirbusA320Factory(id, nombre, plazas320);
                    cliente.comprarBillete(cliente, vueloA320, plazas320);
                    break;

                case 4:
                    System.out.println("Indique el numero de plazas que desea comprar: ");
                    int plazas321 = scanner.nextInt();
                    VueloAirbusA321Factory vueloA321 = new VueloAirbusA321Factory(id, nombre, plazas321);
                    cliente.comprarBillete(cliente, vueloA321, plazas321);
                    break;

                case 5:
                    return;

            }
        }
    }
}
