package com.campusdual.subclasses;

public class Book extends Item/*aqui ponemos "extends Item" porque vamos a extender mas variables,
        a mayores de las variables definidas en items,*/{
    private String author;
    private String isbn;
    //COMO MINIMO el constructor de esta clase
    // debe llamar al constructor de la clase base
    public Book(String title, String author, String publicationDate, String isbn){
        //aqui ponemos super porque son variables ya definidas en la clase items
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
