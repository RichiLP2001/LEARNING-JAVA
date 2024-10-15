package com.campusdual.classes;

public class AnotherClass {
    public static void main(String[] args) {

        Book b1 = new Book("Rhythm of War", "Brandon Sanderson", 1902);
        Book b2 = new Book("The Magician`s Appretice", "Trudi Canavan", 781);

        b1.showBookDetails();
        b2.showBookDetails();
        System.out.println(b1.title);
    }

}