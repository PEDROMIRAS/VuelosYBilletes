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

            int opcionAgencia = scanner.nextInt();
            System.out.println("\n");

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

            int opcionVuelo = scanner.nextInt();
            System.out.println("\n");

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
        System.out.println("==== VENTA VUELOS ====\n1. Vuelo A318\n2. Vuelo A319\n3. Vuelo A320\n4. Vuelo A321\n5. Volver\n");
        System.out.println("Seleccione una opción:");

        int tipoAvionSeleccionado = scanner.nextInt();

        String tipoAvion = "";
        switch (tipoAvionSeleccionado) {
            case 1:
                tipoAvion = "AirbusA318";
                break;
            case 2:
                tipoAvion = "AirbusA319";
                break;
            case 3:
                tipoAvion = "AirbusA320";
                break;
            case 4:
                tipoAvion = "AirbusA321";
                break;
            default:
                System.out.println("Tipo de avion no válido");
                return;
        }
        System.out.println("Ingrese el número de plazas a comprar:");
        int numPlazas = scanner.nextInt();
        System.out.println("Ingrese el id del vuelo: ");
        int id = scanner.nextInt();
        System.out.println("Ingrese la agencia de vuelo: ");
        String agenciaCreadora= scanner.nextLine();

        Vuelo vuelo = new Vuelo(id, tipoAvion, numPlazas, agenciaCreadora);
        cliente.comprarBillete(vuelo, numPlazas);
        List<Billete> billetes = cliente.getBilletes();
        for (Billete billete : billetes){
            System.out.println("Billete: " + billete.getTipoAvion()+" "+ billete.getNumPlazas() + " plazas");
        }
        return;

    }       
}
