package com.campusdual.collections;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<String> instruments = new Stack<>();

        instruments.push("Guitar");
        instruments.push("Piano");
        instruments.push("Drums");
        instruments.push("Violin");

        //ELIMINA EL ULTIMO EN ENTRAR
        String removedItem = instruments.pop();
        System.out.println("Removed instrument: " + removedItem);

        //COGE EL ULTIMO EN LA PILA
        String peekedItem = instruments.peek();
        System.out.println("Peeked instrument: " + peekedItem);

    }
}
