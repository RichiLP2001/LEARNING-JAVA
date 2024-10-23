package com.campusdual.polymorph;

public class Tablet extends Device implements IChargeable{

    //2º --> constructor
    public Tablet(String brand, String model) {
        super(brand, model);
    }
    public void changeScreenOrientation (){
        System.out.println("Switch screen orientation.");
    }

//1º --> implemento los metodos
    @Override
    public void charge() {
        System.out.println("El dispositivo: "+this.getBrand()+" "+ this.getModel() + " is charging at 33 W.");

    }

    @Override
    public void use() {
        System.out.println("Using with screen keyboard");

    }
}
