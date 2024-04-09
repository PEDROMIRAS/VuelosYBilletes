/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;

import java.util.Scanner;

/**
 *
 * @author pmira
 */
public class Menu {
    Scanner scanner = new Scanner(System.in);
    Agencia agencia = new Agencia();
    public static  void mostrarMenuPrincipal() 
    {
        System.out.println("=== MENÚ PRINCIPAL ===");
        System.out.println("1. Agencia");
        System.out.println("2. Cliente");
        System.out.println("3. Salir\n");
        System.out.print("Seleccione una opción: ");
    }

    public  void menuAgencia() {
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

    public  void menuVuelo() {
        while(true){
            Scanner scanner = new Scanner(System.in);
            

            System.out.println("==== MENU VUELO ====");
            System.out.println("1. Crear vuelo A318");
            System.out.println("2. Crear vuelo A319");
            System.out.println("3. Crear vuelo A320");
            System.out.println("4. Crear vuelo A321");
            System.out.println("5. Volver\n");
            System.out.println("Seleccione una opción:\n ");
            
            int opcionVuelo = scanner.nextInt();
            
             
    
            switch (opcionVuelo) {
                case 1:
                    crearVuelo(agencia, new VueloAirbusA318Factory());
                    System.out.println("Vuelo con avion Airbus A318 creado\n");
                    break;
                case 2:
                    crearVuelo(agencia, new VueloAirbusA319Factory());
                    System.out.println("Vuelo con avion Airbus A319 creado\n");
                    break;
                case 3:
                    crearVuelo(agencia, new VueloAirbusA320Factory());
                    System.out.println("Vuelo con avion Airbus A320 creado\n");
                    break;
                case 4:
                    crearVuelo(agencia, new VueloAirbusA321Factory());
                    System.out.println("Vuelo con avion Airbus A321 creado\n");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, introduzca una opción válida.\n");
            }
        }
            
    }

    public static void crearVuelo(Agencia agencia, VueloFactory factory) {
        agencia.crearVuelo(factory);
    }

    public void menuDevolver() {}


    public void menuCliente() {
        while (true) {
        System.out.println("=== MENÚ CLIENTE ===");
        System.out.println("1. Comprar billete");
        System.out.println("2. Volver al menú principal\n");
        System.out.print("Seleccione una opción: ");

        int opcionCliente= scanner.nextInt();

        switch (opcionCliente) { 

            case 1:
                //logica comprar billete
                break;
            case 2:
             return;
        
            default:
            System.out.println("Opción no válida. Por favor, introduzca una opción válida.\n");
            
        }
        
     }   
   }
}
