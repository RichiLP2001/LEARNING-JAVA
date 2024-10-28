package com.campusdual.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        //importamos "java.util.Queue"
        Queue<String> instruments = new LinkedList<>();

        instruments.offer("Guitar");
        instruments.offer("Piano");
        instruments.offer("Drums");
        instruments.offer("Violin");

        System.out.println("Queue of musical instruments: ");
        //FOR-EACH, recorre cada elemento de la coleccion instruments,
            //llamamos a la variable como queramos, ene ste caso "item"

        for(String item : instruments){
            System.out.println(item);

        }

        //ELIMINAMOS UN ELEMENTO DE LA COLECCION
        String removedInstrument = instruments.poll();
        System.out.println("\nRemoved: " + removedInstrument);

        System.out.println("\n Queue after removal");
        for (String item : instruments){
            System.out.println(item);
        }

        //AGREGAMOS UN ELEMENTO A LA COLECCION

        String peekedInstrument = instruments.peek();
        System.out.println("\nPeeked: " + peekedInstrument);

        System.out.println("\n Queue after peeked");
        for (String item : instruments){
            System.out.println(item);
        }




    }
}
