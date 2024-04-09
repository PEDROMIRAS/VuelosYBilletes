/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;
/**
 *
 * @author pmira
 */
public class VueloAirbusA318Factory implements VueloFactory {
    private static VueloAirbusA318Factory instance;
    private int id = 0;

    public VueloAirbusA318Factory() {
    }
    public static VueloAirbusA318Factory getInstance() {
        if (instance == null) {
            instance = new VueloAirbusA318Factory();
        }
        return instance;
    }

    @Override
    public Vuelo crearVuelo() {
        return new Vuelo(++id, "A318", 150);
    }
    
    public void resetId() {
        id = 0;
    }
}
