package com.campusdual.override;

public class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Stating the car.");
    }
}
