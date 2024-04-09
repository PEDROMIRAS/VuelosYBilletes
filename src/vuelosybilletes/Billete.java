package vuelosybilletes;

public class Billete {
    private Vuelo vuelo;
    private int plazas;

    public Billete(Vuelo vuelo, int plazas) {
        this.vuelo = vuelo;
        this.plazas = plazas;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}