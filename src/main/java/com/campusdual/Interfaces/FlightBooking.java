package com.campusdual.Interfaces;

import javax.print.attribute.standard.Sides;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FlightBooking implements IBooking{
    private String company;
    private String flightNumber;
    //-->por defecto en esta clase iniciara con un valor vacio
    private String bookedSeat= "";
    private Date bookDate;
    //--> para guardar fechas
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");


    //solo creamos un constructor de estas 2 variables -->
    //--> no necesito inicializar el resto de variables
    // , pues ya se hara posteriormente en el codigo
    public FlightBooking(String company, String flightNumber) {
        this.company = company;
        this.flightNumber = flightNumber;



    }

    public String getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(String bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    //--> IMPLEMENTES; implementamos los metodos de la interface.
    @Override
    public void book(Date bookDate, String... args) {
        //puedo filtrar si la variable String bookedSeat está vacía
        //-->opciones a usar --> isEmpty: que el tamaño lenght es cero
        //--> opcion 2 --> isWhite : espacios vacios sin info.
        if(bookedSeat.isEmpty() && args.length > 0){
                        //"args != null" Ó "args.length > 0"
            this.bookedSeat = args[0];
            this.bookDate = bookDate; // <-- la DATE que me pasan por parametro
            System.out.println("Booked seat on "+ this.company + " "+ this.flightNumber);
        }else{
            System.out.println("Cannot perform a flight reservation.");
        }

    }

    @Override
    public void cancelBook() {
        this.bookedSeat="";
        System.out.println("Booked succesfully cancelled.");

    }

    @Override
    public void getTicketDetail() {
    if(!this.bookedSeat.isEmpty()){
        //valor de la expresion en true = NO ESTÁ VACÍO
        System.out.println("Flight "+ this.flightNumber
                + " ("+this.company+"), for date " + this.sdf.format(this.bookDate)+ " has a seat booked: "+this.bookedSeat);



    }else{
        // el valor de la expresion es false
        System.out.println("This flight is not booked");
    }

    }
}
