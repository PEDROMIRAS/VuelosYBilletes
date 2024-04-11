/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelosybilletes;

import java.util.List;

//import java.util.List;

/**
 *
 * @author pmira
 */
public class Vuelo {
    
    private int NUM_PLAZAS = 0;

    public Vuelo(){}
    
    protected int id;
   
    private String tipoAvion;

    public List<Vuelo> vuelosCreados;
    private String agenciaCreadora;
     
    public Vuelo(int id, String tipoAvion, int numPlazas, String agenciaCreadora) {
        this.id = id;
        this.tipoAvion = tipoAvion;
        this.NUM_PLAZAS = numPlazas;
        this.agenciaCreadora = agenciaCreadora; 
       
    }
    public void datosVuelo(){
        System.out.println("El ID del vuelo es: ");
        System.out.println("El tipo de avion es: ");
        System.out.println("El numero de plazas del avion es: ");
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public void setNumPlazas(int numPlazas) {
        this.NUM_PLAZAS = numPlazas;
    }
    public int getNumPlazas() {
        return NUM_PLAZAS;
    }
    public String getAgenciaCreadora(){
        return agenciaCreadora;
    }
    public void setAgenciaCreadora(String agenciaCreadora) {
        this.agenciaCreadora="Vuelos Murcia";
    }
    public boolean isAgenciaCreadora(String agencia) {
        return agenciaCreadora.equals(agencia);
    }
    //Plazas para la venta
    public boolean plazasReservadas(String tipoAvion){
        if(NUM_PLAZAS >0){
            NUM_PLAZAS--;
           return true;
        }else{
            return false;
        }
    }


}
