package com.campusdual.subclasses;

public class Item {
    //1º ponemos los atributos
    private String title;
    private String publicationDate;
    //--> este como es un valor primitivo, lo
    // ponemos como false-->
    private boolean checkedOut = false;
 //2º aqui generate--> book--> seleccionamos las vaiables
    public Item(String title, String publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }
//3º generate--> getter and setter --> de variable title y publication
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public String getDetails (){
        return "Title: "+this.title+". Publication date: "+ this.publicationDate+"Checked Out: "+this.checkedOut;
    }
}
