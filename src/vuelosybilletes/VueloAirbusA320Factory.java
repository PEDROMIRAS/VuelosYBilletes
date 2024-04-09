/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;

/**
 *
 * @author pmira
 */
class VueloAirbusA320Factory implements VueloFactory {
    private static VueloAirbusA320Factory instance;
    private  int id = 0;
    
    public VueloAirbusA320Factory(){

    }

    public static VueloAirbusA320Factory getInstance(){
        if (instance == null) {
            instance = new VueloAirbusA320Factory();
        }
        return null;
    }
    @Override
    public Vuelo crearVuelo() {
        return new Vuelo(++id, "A320", 250); // Se asigna una capacidad de 250 plazas por defecto
    }
     public void resetId(){
        id=0;
     }
}
