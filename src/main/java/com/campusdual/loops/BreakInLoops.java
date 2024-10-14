package com.campusdual.loops;

import com.campusdual.Utils;

public class BreakInLoops {

    public static void breakInLoop () {
        System.out.println("Write a 0 to stop: ");
        int number = Utils.integer("How many white rabbit are there?: ");
        while (true){
            if (number == 0){
                System.out.println("Almost");
                break;
            }
            number = Utils.integer("Ah, ah, ah, you didn´t say the magic word!");
        }
    }
    public static void main(String[] args) {
        breakInLoop();
    }
}
