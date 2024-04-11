package vuelosybilletes;

import java.util.List;
import java.util.ArrayList;



public class Cliente{
    private List<Billete> billetes = new ArrayList<>();
     public void comprarBillete(Vuelo vuelo, int NUM_PLAZAS){
        String tipoAvion= vuelo.getTipoAvion();

       if (vuelo.getNumPlazas()>= NUM_PLAZAS){
        vuelo.setNumPlazas(vuelo.getNumPlazas()-NUM_PLAZAS);
        Billete billete =new Billete(tipoAvion,NUM_PLAZAS);
        billetes.add(billete);
       }else{
        System.out.println("No hay suficientes plazas disponibles");
       }
    }
    public List<Billete> getBilletes(){
        return billetes;
    }
}


