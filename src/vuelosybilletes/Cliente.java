package vuelosybilletes;

import java.util.List;
import java.util.ArrayList;



public class Cliente{
    private final List<Billete> billete;

    public Cliente(String nombre){
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
        billete.add(new Billete(vuelo, numPlazas));
    }

    public List<Billete> getBillete() {
        return billete;
    }
}

