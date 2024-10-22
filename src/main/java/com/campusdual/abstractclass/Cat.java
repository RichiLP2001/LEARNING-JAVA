package com.campusdual.abstractclass;

public class Cat extends Animal{
    public Cat(String animalName) {
        super(animalName);
    }

    @Override

    public void makeSound() {
        System.out.println("meow");    }

    @Override
    public void climbing() {
        System.out.println("the cat is climbing..So cuuuuute ");
    }
}
