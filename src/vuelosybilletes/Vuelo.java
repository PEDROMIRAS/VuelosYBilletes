/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;

/**
 *
 * @author pmira
 */
public class Vuelo {
    private int id;
    private int numPlazas;
    private String tipoAvion;

    public Vuelo(int id, String tipoAvion, int numPlazas) {
        this.id = id;
        this.tipoAvion = tipoAvion;
        this.numPlazas = getNumPlazasPorTipoAvion(tipoAvion);
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    private int getNumPlazasPorTipoAvion(String tipoAvion) {
        switch (tipoAvion) {
            case "A318":
                return 150;
            case "A319":
                return 200;
            case "A320":
                return 250;
            case "A321":
                return 300;
            default:
                throw new IllegalArgumentException("Tipo de avión no válido");
        }
    }
}
