package com.campusdual.abstractclass;

public class Zoo {
    public static void main(String[] args) {
        //Animal a = new Animal("Cat");
        Cat c = new Cat("Cat");
        Fox zorro = new Fox("Zzz");
        AngoraCat ac= new AngoraCat("Gato Carnivoro");

        ac.makeSound();
        c.makeSound();
        zorro.makeSound();

        c.sleep();
        zorro.sleep();
        ac.sleep();

        c.wakeUp();
        zorro.wakeUp();
        ac.wakeUp();

        c.climbing();
        ac.climbing();

    }
}
