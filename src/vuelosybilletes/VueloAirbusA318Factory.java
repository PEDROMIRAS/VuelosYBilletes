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
    static int id=1;
    static String tipoAvion="Airbus A318";
    static int numPlazas=100;
    @Override
    public void datosVuelo(){
        
        System.out.println("\nEl ID del vuelo es: "+id);
        System.out.println("El tipo de avion es: "+tipoAvion);
        System.out.println("El numero de plazas del avion es: "+numPlazas+"\n");
    }
    
}
