package com.campusdual.subclasses;

public class Item {
    //1º ponemos los atributos
    private String title;
    private String publicationDate;
    //--> este como es un valor primitivo, lo
    // ponemos como false-->
    private boolean checkedOut = false;
 //2º aqui generate--> book--> seleccionamos las variables
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

    public void checkedOut(){
        //--> !this.Checkedout --> condicion de que no sea igual a verdadero
        if (!this.isCheckedOut()){
            this.checkedOut = true;
            System.out.println(this.title+" has been checked out.");
        }else{
            System.out.println(this.title+ " is already checked out.");
        }
    }

    //cuando devuelven el DVD
    public void returnItem(){
        if (this.checkedOut){
            this.checkedOut = false;
            System.out.println(this.title+" has been returned.");
        }else{
            System.out.println(this.title+" was not checked out.");
        }
    }
}
