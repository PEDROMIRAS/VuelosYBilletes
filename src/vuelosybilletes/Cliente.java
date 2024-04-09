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

    public void comprarBillete(Cliente cliente ,Vuelo vuelo, int numPlazas) {
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
    public String getNombre(){
        return nombre;
    }
    public Vuelo getVuelo(){
        return vueloActual;
    }
    /*
     * @Override
    public void comprarBillete(Cliente cliente ,VueloFactory vueloFactory, int numPlazas) {
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
     */
    
}

