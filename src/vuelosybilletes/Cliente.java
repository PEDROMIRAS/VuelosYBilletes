package vuelosybilletes;

import java.util.List;
import java.util.ArrayList;


public class Cliente{
    private List<Billete> billetes = new ArrayList<>();
     public void comprarBillete(Vuelo vuelo, int NUM_PLAZAS){
        String tipoAvion= vuelo.getTipoAvion();
if (vuelo.isAgenciaCreadora("Vuelos Murcia")) {
    if (vuelo.getNumPlazas()>= NUM_PLAZAS){
        vuelo.setNumPlazas(vuelo.getNumPlazas()-NUM_PLAZAS);
        Billete billete =new Billete(tipoAvion,NUM_PLAZAS);
        billetes.add(billete);
       }else{
        System.out.println("No hay suficientes plazas disponibles");
       }
    }else {
    System.out.println("El vuelo no ha sido creado por la agencia");
    }
       
    }

    public List<Billete> getBilletes(){
        return billetes;
    }
  }



