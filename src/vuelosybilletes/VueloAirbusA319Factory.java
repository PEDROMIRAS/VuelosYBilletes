/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;

/**
 *
 * @author pmira
 */
class VueloAirbusA319Factory extends Vuelo {
    
    private static int nextId = 1;
    private static final String TIPO_AVION = "Airbus A319";
    private static final int NUM_PLAZAS = 250;
    private int id;

    public VueloAirbusA319Factory() {
        this.id = nextId;
        nextId++;
    }

    @Override
    public void datosVuelo() {
        System.out.println("\nLos datos del vuelo creado son:");
        System.out.println("\nEl ID del vuelo es: " + id);
        System.out.println("El tipo de avion es: " + TIPO_AVION);
        System.out.println("El numero de plazas del avion es: " + NUM_PLAZAS + "\n");
    }
    
}
