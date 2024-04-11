package vuelosybilletes;

public class Billete {
    private String tipoAvion;
    private int NUM_PLAZAS; 
     public Billete(String tipoAvion, int NUM_PLAZAS) {
        this.tipoAvion=tipoAvion;
        this.NUM_PLAZAS=NUM_PLAZAS;
    }
    public String getTipoAvion() {
        return tipoAvion;
    }
    public int getNumPlazas() {
        return NUM_PLAZAS;
    }

}
