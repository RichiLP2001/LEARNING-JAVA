package com.campusdual.encapsulation;

public class Vehicle {
        //Definimo atributo, como: marca, modelo, matricula
        // disponibilidad para alquilar y velocidad maxima legal
        //1º definimos las variables
    private String licensePlate;
    private String brand;
    private String model;
    private boolean available;
    public static final int LEGAL_MAX_SPEED = 120;

    public Vehicle(String licensePlate, String brand, String model) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.available = true;
    }
    //EJEMPLO DE GETTER
    public String getLicensePlate(){
        return this.licensePlate;
    }
    //EJEMPLO DE SETTER; establece valor
    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public boolean isAvaible() {        return available;
    }

    public void setAvaible(boolean available) {
        this.available = available;
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
    public void rentACar(){
        //la simplifacion de "if (this.available) == true" --> if (this.available)
        if (this.available){
            this.available = false;
            System.out.println("The vehicle with license plate "+this.licensePlate+" has been rented.");
        } //hay que poner el "else" porque si no saldrian los dos comentarios a la vez
        else {
            System.out.println("The vehicle with license plate " + this.licensePlate + " is not available.");
        }

    }
    public void returnACar(){
        // para simplificar "if(this.available == false)" --> " if(this.available)"
        if(this.available == false){
            //como mi verdadero es cuando available es false --> pido falso y llega falso
            // , quiere decir que es VERDADERO para mi condicion, por lo que mi primera instruccion
            // debe ser volverlo en verdadera esa respuesta y que peuda entrar en el if
            this.available = true;
           System.out.println("The vehicle with license plate "+this.licensePlate+" has been returned.");
        }else{
            System.out.println("The vehicle with license plate "+this.licensePlate+" has been returned.");
        }
    }

    public String getDetails(){
        //1º manera
            /* return this.getBrand() +" "+ this.getModel() +", license plate: "+ this.getLicensePlate();*/
        //2º manera de hacerlo
        return this.brand +" "+ this.model +"\n\tLicense plate: "+ this.licensePlate + "\n\tAvailable: "+ (this.available ? "yes" : "No");

    }


    public static void main(String[] args) {
        Vehicle v = new Vehicle("0000BBB","Citroën","Xsara");
        System.out.println(v.getDetails());
        v.rentACar();
        System.out.println(v.getDetails());
        v.returnACar();
        System.out.println(v.getDetails());
    }

}
