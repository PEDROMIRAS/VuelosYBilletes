package vuelosybilletes;

import java.util.List;
import java.util.ArrayList;

public class Cliente{
    private String nombre;
    private Vuelo vueloActual;
    private List<Billete> billete;

    public Cliente(String nombre){
        this.nombre=nombre;
        billete= new ArrayList<>();
    }

    public void comprarBillete(Vuelo vuelo, int numPlazas) {
        // Comprobar si el vuelo tiene suficientes plazas disponibles
        if (vuelo.getNumPlazas() < numPlazas) {
            System.out.println("No hay suficientes plazas disponibles en este vuelo.");
            return;
        }

        // Restar el número de plazas al vuelo
        vuelo.setNumPlazas(vuelo.getNumPlazas() - numPlazas);

        // Añadir el billete al cliente
        billete.add(new Billete());
    }
    public String getNombre(){
        return nombre;
    }
    public Vuelo getVuelo(){
        return vueloActual;
    }
}

/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Flight Booking System!");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        Cliente cliente = new Cliente(name);
        System.out.println("Welcome, " + name + "!");
        System.out.println("Here are the available flights:");
        // Print the list of available flights
        System.out.println("1. Flight 1");
        System.out.println("2. Flight 2");
        System.out.println("3. Flight 3");
        System.out.println("Please enter the number of the flight you would like to book:");
        int flightNumber = scanner.nextInt();
        System.out.println("Please enter the number of tickets you would like to purchase:");
        int numTickets = scanner.nextInt();
        switch (flightNumber) {
            case 1:
                Vuelo vuelo1 = new Vuelo("Flight 1", 100);
                cliente.comprarBillete(vuelo1, numTickets);
                break;
            case 2:
                Vuelo vuelo2 = new Vuelo("Flight 2", 200);
                cliente.comprarBillete(vuelo2, numTickets);
                break;
            case 3:
                Vuelo vuelo3 = new Vuelo("Flight 3", 300);
                cliente.comprarBillete(vuelo3, numTickets);
                break;
            default:
                System.out.println("Invalid flight number. Please try again.");
                break;
        }
    }
}
 */