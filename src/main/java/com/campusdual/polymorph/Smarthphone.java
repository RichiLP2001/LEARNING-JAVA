package com.campusdual.polymorph;

public class Smarthphone extends Device implements IChargeable{

    public Smarthphone(String brand, String model) {
        super(brand, model);
    }


    public void makeACall(){
        System.out.println("Making a call");
    }


    @Override
    public void charge() {
        System.out.println("El dispositivo: "+this.getBrand()+" "+ this.getModel() + " is charging at 15 W.");
    }

    @Override
    public void use() {
        System.out.println("Using with touche screen");
    }
}
