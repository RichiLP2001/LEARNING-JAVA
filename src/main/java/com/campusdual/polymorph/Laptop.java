package com.campusdual.polymorph;

public class Laptop extends Device implements IChargeable{

    public Laptop(String brand, String model) {
        super(brand, model);
    }

    public void changeScreenOrientation(){
        System.out.println("Close screen, preventing power-saving mode");
    }

    @Override
    public void charge() {
        System.out.println("El dispositivo: "+this.getBrand()+" "+ this.getModel() + " is charging at 65 W.");

    }

    @Override
    public void use() {
        System.out.println("Using with keyboard and mouse");

    }
}
