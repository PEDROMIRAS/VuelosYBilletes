package vuelosybilletes;

import java.util.Scanner;

public class CreadorVueloConcreto extends CreadorVuelo{

    String tipoAvion;
    Scanner scanner = new Scanner(System.in);
    public CreadorVueloConcreto(String v){
        tipoAvion=v;
    }

    @Override
    public Vuelo crearVuelo(){
       
       
        if (tipoAvion.equalsIgnoreCase("AirbusA318"))
        { 
          return new VueloAirbusA318Factory(); 
        }else if (tipoAvion.equalsIgnoreCase("AirbusA319")) 
        {
         return new VueloAirbusA319Factory();  
        }else if (tipoAvion.equalsIgnoreCase("AirbusA320")) 
        {
          return new VueloAirbusA320Factory();  
        }else if (tipoAvion.equalsIgnoreCase("AirbusA321"))
        {
         return new VueloAirbusA321Factory();   
        }else {
            System.out.println("Tipo de avion para vuelo no valido");
            return null;
        }
        

    }
}
