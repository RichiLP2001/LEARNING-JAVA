package com.campusdual.loops;

import com.campusdual.Utils;

public class InfiniteLoop {

    public static void infiniteLoop () {
        System.out.println("Write a 0 to stop: ");
        int number = Utils.integer("How many white rabbit are there?: ");
        while (true){
            System.out.println("Ah, ah, ah, you didn´t say the magic word!");
        }
    }


    public static void main(String[] args) {
    infiniteLoop(); // SI EJECUTAMOS ESTO, SE COMERA LA MEMORIA DEL PC
    }
}
