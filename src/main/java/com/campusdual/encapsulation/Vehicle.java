package com.campusdual.encapsulation;

public class Vehicle {
        //Definimo atribuco, como: marca, modelo, matricula
        // disponibilidad para alquilar y velocidad maxima legal
        //1º definimos las variables
    private String licensePlate;
    private String brand;
    private String model;
    private boolean avaible;
    public static final int LEGAL_MAX_SPEED = 120;

    public Vehicle(String licensePlate, String brand, String model) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.avaible = true;
    }
    //EJEMPLO DE GETTER
    public String getLicensePlate(){
        return this.licensePlate;
    }
    //EJEMPLO DE SETTER; establece valor
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public boolean isAvaible() {        return avaible;
    }

    public void setAvaible(boolean avaible) {
        this.avaible = avaible;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
