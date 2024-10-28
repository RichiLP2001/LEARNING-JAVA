package com.campusdual.collections;

import java.util.ArrayList;
//importante importar el java.util.list
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        //Crear una lista - sera una lista de caednas de texto(STRINGS)

        List<String> instruments = new ArrayList<String>();
        //Todas las colecciones suelen tener un componente add
        instruments.add("Guitar");
        instruments.add("Piano");
        instruments.add("Drums");
        instruments.add("Bass");

        //pinte: instrumento y su INDICE en la lista

        for (int i=0; i< instruments.size();i++){
            System.out.println("Instrument at index " + i + ": " + instruments.get(i));
        }
            /*//ELIMINAR ELEMENTOS DE LA LISTA
        instruments.remove("Piano");
                //"o"= objeto*/
        //ELIMINAR ELEMENTOS DE LA LISTA, POR INDICE
        instruments.remove(instruments.get(1));

        //MOSTRAR FACIL: Los ELEMENTOS de la LISTA
        for(String item : instruments){
            System.out.println(item);
        }
    }
}
