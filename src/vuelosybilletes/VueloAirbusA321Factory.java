/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;

/**
 *
 * @author pmira
 */
class VueloAirbusA321Factory implements VueloFactory {
    private static VueloAirbusA321Factory instance;
    private int id = 0;

    public VueloAirbusA321Factory(){

    }

    public static VueloAirbusA321Factory getInstance(){
        if (instance == null) {
            instance = new VueloAirbusA321Factory();
        }
        return instance;
    }
    @Override
    public Vuelo crearVuelo() {
        return new Vuelo(++id, "A321", 300); // Se asigna una capacidad de 300 plazas por defecto
    }
    public void resetId(){
        id=0;
    }
}
