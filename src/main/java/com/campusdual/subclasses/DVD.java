package com.campusdual.subclasses;
// "extends Item", esto quiere decir que voy a poder
//  acceder a todo lo que integre la clase "Item", y a mayores lo extiendo con lo de esta clase.
public class DVD extends Item{
    //--> definimos tipo de variable de los atributos y su ACCESIBILIDAD
    private String director;
    private int duration;

    public DVD(String title, String publicationDate, String director, int duration) {
        super(title, publicationDate);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void play(){
        System.out.println("PLaying DVD: "+this.getDetails());
    }
}
