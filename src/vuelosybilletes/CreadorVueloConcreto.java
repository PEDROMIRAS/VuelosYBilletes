package vuelosybilletes;

public class CreadorVueloConcreto extends CreadorVuelo{

    String tipoAvion;
    
    public CreadorVueloConcreto(String v){
        tipoAvion=v;
    }

    @Override
    public Vuelo crearVuelo(){
        
        if (tipoAvion.equalsIgnoreCase("Airbus A318"))
        { 
          return new VueloAirbusA318Factory(); 
        }else if (tipoAvion.equalsIgnoreCase("Airbus A319")) 
        {
         return new VueloAirbusA319Factory();  
        }else if (tipoAvion.equalsIgnoreCase("Airbus A320")) 
        {
          return new VueloAirbusA320Factory();  
        }else if (tipoAvion.equalsIgnoreCase("Airbus A321"))
        {
         return new VueloAirbusA321Factory();   
        }else {
            System.out.println("Tipo de avion para vuelo no valido");
            return null;
        }
        

    }
}
