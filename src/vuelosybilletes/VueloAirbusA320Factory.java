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
class VueloAirbusA320Factory extends Vuelo {

    private static int nextId = 1;
    private static final String TIPO_AVION = "Airbus A320";
    private static final int NUM_PLAZAS = 200;
    private int id;
    private Vuelo vuelo;
    Scanner scanner = new Scanner(System.in);

    public VueloAirbusA320Factory() {
        this.id = nextId;
        nextId++;
        this.vuelo = new Vuelo(this.id, TIPO_AVION, NUM_PLAZAS,getAgenciaCreadora());

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
