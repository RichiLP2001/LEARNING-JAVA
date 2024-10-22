package com.campusdual.abstractclass;

public abstract class Animal {
    public String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void sleep (){
        System.out.println(this.animalName+" is sleeping.");
    }
    public void wakeUp () {
        System.out.println(this.animalName + " is wake up.");
    }

    public void makeSound (){
        System.out.println(this.animalName+" is making sound.");
    }

    public void climbing (){
        System.out.println((this.animalName+" is climbing"));
    }
}

