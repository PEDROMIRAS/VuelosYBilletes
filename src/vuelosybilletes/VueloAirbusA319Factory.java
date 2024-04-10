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
    
    public VueloAirbusA319Factory(int id, String tipoAvion, int numPlazas) {
        super(id, tipoAvion, numPlazas);
       
    }

    int id=2;
    String tipoAvion="Airbus A319";
    int numPlazas=150;
    @Override
    public void datosVuelo(){
        
        System.out.println("El ID del vuelo es: "+id);
        System.out.println("El tipo de avion es: "+tipoAvion);
        System.out.println("El numero de plazas del avion es: "+numPlazas);
    }
    
}
