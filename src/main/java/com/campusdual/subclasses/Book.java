package com.campusdual.subclasses;

public class Book extends Item{
    private String author;
    private String isbn;
    //COMO MINIMO el constructor de esta clase
    // debe llamar al constructor de la clase base
    public Book(String title, String author, String publicationDate, String isbn){
        super(title, publicationDate);
        this.author = author;
        this.isbn = isbn;

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
