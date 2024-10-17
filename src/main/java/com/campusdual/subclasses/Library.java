package com.campusdual.subclasses;

public class Library {
    public static void main(String[] args) {
        Item item = new Item("New Item", "2010-01-02");
        Book book = new Book("The Martian Chronicles", "Ray BRadbury", "1950-05-04","982391238192");
        System.out.println(item.getDetails());
        System.out.println(book.getDetails());
    }
}
