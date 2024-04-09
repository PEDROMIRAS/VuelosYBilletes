/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;

/**
 *
 * @author pmira
 */
class VueloAirbusA319Factory implements VueloFactory {
    private static VueloAirbusA319Factory instance;
    private int id = 0;

    public VueloAirbusA319Factory() {
    }
 public static VueloAirbusA319Factory getInstance() {
    if (instance == null) {
        instance = new VueloAirbusA319Factory();
    }
     return instance;    
    }
    @Override
    public Vuelo crearVuelo() {
        return new Vuelo(++id, "A319", 200); // Se asigna una capacidad de 200 plazas por defecto
    }
    public void resetId(){
        id=0;
    }
}
