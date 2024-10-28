package com.campusdual.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> instruments = new HashSet<>();
        instruments.add("Guitar");
        instruments.add("Piano");
        instruments.add("Drums");
        instruments.add("Bass");
        instruments.add("Drums");
        instruments.add("Piano");
        instruments.add("Drums");

        System.out.println("Set of musical instruments: ");

        //MOSTRAR ELEMENTOS del grupo
        for (String instrument : instruments){
            System.out.println(instrument);
        }
            //elminamos un elemento de la lista
        instruments.remove("Drums");
            //agregamos uno nuevo
        instruments.add("Flute");
        System.out.println("========================\n " +
                "Set after modifications: ");

        for (String instrument : instruments){
            System.out.println(instrument);
        }
    }
}
