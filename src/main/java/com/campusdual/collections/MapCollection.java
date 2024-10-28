package com.campusdual.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {


        Map<String, String> instrumentsTypes = new HashMap<>();

        //PAra BUSCAR INFO. --> con "put"
        instrumentsTypes.put("Guitar", "string");
        instrumentsTypes.put("Piano","String");
        instrumentsTypes.put("Drums","Percussion");
        instrumentsTypes.put("Violin","String");

        System.out.println("Map of musical instruments and types");
        //
        for(Map.Entry <String,String> entry : instrumentsTypes.entrySet()){
            //tenemos qe coger sus entradas
            // , y una vez en su entrada,
            // recorrer cada entrada una a una
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        instrumentsTypes.put("Piano","Percussion");

        System.out.println("==================\n"+"Map after modification: ");
        for(Map.Entry <String,String> entry : instrumentsTypes.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
        System.out.println("Contains specific key");
            //--> miro si contiene el Piano en la coleccion
            //si la tiene, pondra TRUE
        System.out.println(instrumentsTypes.containsKey("Piano"));

        }
}
