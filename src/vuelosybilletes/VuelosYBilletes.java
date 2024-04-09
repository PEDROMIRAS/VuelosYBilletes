/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vuelosybilletes;

import java.util.Scanner;

/**
 *
 * @author pmira
 */
public class VuelosYBilletes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
    
        while (true) {
            Menu.mostrarMenuPrincipal();
            int opcionPrincipal = scanner.nextInt();
            
            switch (opcionPrincipal) { 
                case 1:
                    menu.menuAgencia();
                    break;
                case 2:
                    menu.menuCliente();
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

}
