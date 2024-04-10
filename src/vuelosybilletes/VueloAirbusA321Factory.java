/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;

/**
 *
 * @author pmira
 */
class VueloAirbusA321Factory extends Vuelo{
    
    public VueloAirbusA321Factory(){}

    static int id=4;
    static String tipoAvion="Airbus A321";
    static int numPlazas=250;
    @Override
    public void datosVuelo(){
        
        System.out.println("\nEl ID del vuelo es: "+id);
        System.out.println("El tipo de avion es: "+tipoAvion);
        System.out.println("El numero de plazas del avion es: "+numPlazas+"\n");
    }
}
