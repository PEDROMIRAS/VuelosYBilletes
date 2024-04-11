/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pmira
 */
public class VueloAirbusA318Factory extends Vuelo {
    private static int nextId = 1;
    private static final String TIPO_AVION = "Airbus A318";
    private static final int NUM_PLAZAS = 100;
    private int id;
    private Vuelo vuelo;
    private static List<String> tipoCreados = new ArrayList<>();

    public VueloAirbusA318Factory() {
        if (tipoCreados.contains(TIPO_AVION)) {
            throw new IllegalStateException("El vuelo del tipo  " + TIPO_AVION + " ya ha sido creado");
        }
        this.id = nextId;
        this.vuelo = new Vuelo(this.id, TIPO_AVION, NUM_PLAZAS,getAgenciaCreadora());
        tipoCreados.add(TIPO_AVION);
    }

    @Override
    public void datosVuelo() {
        System.out.println("\nLos datos del vuelo creado son:");
        System.out.println("\nEl ID del vuelo es: " + id);
        System.out.println("El tipo de avion es: " + TIPO_AVION);
        System.out.println("El numero de plazas del avion es: " + NUM_PLAZAS);
        System.out.println("La agencia creadora del vuelo es:"+getAgenciaCreadora() + "\n");
    }
    public Vuelo getVuelo(){
        return vuelo;
    }
}
