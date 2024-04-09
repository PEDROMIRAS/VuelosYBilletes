/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pmira
 */
public class Agencia {
    private List<Vuelo> vuelosCreados;

    public Agencia() {
        vuelosCreados = new ArrayList<>();
    }

    public void crearVuelo(VueloFactory factory) {
        Vuelo vuelo = factory.crearVuelo();
        vuelosCreados.add(vuelo);
    }

    public List<Vuelo> obtenerVuelos() {
        return vuelosCreados;
    }
}
