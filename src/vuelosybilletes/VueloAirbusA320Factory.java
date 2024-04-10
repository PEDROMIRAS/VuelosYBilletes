/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;

/**
 *
 * @author pmira
 */
class VueloAirbusA320Factory extends Vuelo {

    public VueloAirbusA320Factory(){}

    int id=3;
    String tipoAvion="Airbus A320";
    int numPlazas=200;
    @Override
    public void datosVuelo(){
        
        System.out.println("El ID del vuelo es: "+id);
        System.out.println("El tipo de avion es: "+tipoAvion);
        System.out.println("El numero de plazas del avion es: "+numPlazas);
    }
     
}
