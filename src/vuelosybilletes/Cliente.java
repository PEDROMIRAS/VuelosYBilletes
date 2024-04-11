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
    public void devolverBilletes(String tipoAvion, int NUM_PLAZAS) {
        int numBilletesComprados = 0;
        for (Billete billete : billetes) {
            if (billete.getTipoAvion().equals(tipoAvion)) {
                numBilletesComprados += billete.getNumPlazas();
            }
        }
        if (numBilletesComprados >= NUM_PLAZAS) {
            for (int i = 0; i < NUM_PLAZAS; i++) {
                for (int j = 0; j < billetes.size(); j++) {
                    Billete billete = billetes.get(j);
                    if (billete.getTipoAvion().equals(tipoAvion)) {
                        billetes.remove(j);
                        break;
                    }
                }
            }
        } else {
            System.out.println("No se pueden devolver " + NUM_PLAZAS + " billetes porque solo se han comprado " + numBilletesComprados + " billetes de ese tipo de avión.");
        }
    }

    public List<Billete> getBilletes(){
        return billetes;
    }
}


