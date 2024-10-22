package com.campusdual.abstractclass;

public class AngoraCat extends Animal{
    public AngoraCat(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Gato GRRRR");
    }

    @Override
    public void climbing() {
        System.out.println(" owowoow dangerous cat");
    }

}
