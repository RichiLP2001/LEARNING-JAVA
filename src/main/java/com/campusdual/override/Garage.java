package com.campusdual.override;

public class Garage {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Tractor d = new Tractor();

        v.start();
        c.start();
        d.start();
    }
}
