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
    
    public VueloAirbusA319Factory(){}

    static int id=2;
    static String tipoAvion="Airbus A319";
    static int numPlazas=150;
    @Override
    public void datosVuelo(){
        System.out.println("\nLos datos del vuelo creado son:");
        System.out.println("\nEl ID del vuelo es: "+id);
        System.out.println("El tipo de avion es: "+tipoAvion);
        System.out.println("El numero de plazas del avion es: "+numPlazas+"\n");
    }
    
}
