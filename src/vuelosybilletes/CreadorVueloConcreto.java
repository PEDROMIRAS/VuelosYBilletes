package vuelosybilletes;

public class CreadorVueloConcreto extends CreadorVuelo{

    String tipoAvion;
    int id;
    int numPlazas;

    public CreadorVueloConcreto(String tipoAvion, int id, int numPlazas){
        this.tipoAvion = tipoAvion;
        this.id = id;
        this.numPlazas = numPlazas;
    }

    @Override
    public Vuelo crearVuelo(){
        
        if (tipoAvion.equalsIgnoreCase("Airbus A318"))
        { 
          return new VueloAirbusA318Factory(id, tipoAvion, numPlazas); 
        }else if (tipoAvion.equalsIgnoreCase("Airbus A319")) 
        {
         return new VueloAirbusA319Factory(id, tipoAvion, numPlazas);  
        }else if (tipoAvion.equalsIgnoreCase("Airbus A320")) 
        {
          return new VueloAirbusA320Factory(id, tipoAvion, id);  
        }else if (tipoAvion.equalsIgnoreCase("Airbus A321"))
        {
         return new VueloAirbusA321Factory(id, tipoAvion, numPlazas);   
        }else {
            System.out.println("Tipo de avion para vuelo no valido");
            return null;
        }
        

    }
}
