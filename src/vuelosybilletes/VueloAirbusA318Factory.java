/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;
/**
 *
 * @author pmira
 */
public class VueloAirbusA318Factory extends Vuelo {
    
    
    public VueloAirbusA318Factory() {}
    int id=1;
    String tipoAvion="Airbus A318";
    int numPlazas=100;
    @Override
    public void datosVuelo(){
        
        System.out.println("El ID del vuelo es: "+id);
        System.out.println("El tipo de avion es: "+tipoAvion);
        System.out.println("El numero de plazas del avion es: "+numPlazas);
    }
    /* @Override
    public Vuelo crearVuelo() {
        return new Vuelo(1, "A318", 150);
    }*/
    
    
}
