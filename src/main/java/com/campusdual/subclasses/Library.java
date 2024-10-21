package com.campusdual.subclasses;

public class Library {
    public static void main(String[] args) {
        Item item = new Item("New Item", "2010-01-02");
        Book book = new Book("The Martian Chronicles", "Ray BRadbury", "1950-05-04","982391238192");
        Magazine magazine = new Magazine("History National Geographic","2024-05",245,"Josep Maria Casals");
        DVD dvd = new DVD("Inception","2010-07-16","Christopher Nolan",148);
        System.out.println(item.getDetails());
        System.out.println(book.getDetails());

        book.checkedOut();
        book.returnItem();

        System.out.println(magazine.getDetails());
        magazine.checkedOut();
        magazine.returnItem();

        System.out.println(dvd.getDetails());
        dvd.checkedOut();
        dvd.play();
        dvd.returnItem();
    }
}
