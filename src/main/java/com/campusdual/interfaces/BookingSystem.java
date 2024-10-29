package com.campusdual.interfaces;

import java.util.Date;

public class BookingSystem {
    public static void main(String[] args) {
        CarBooking cb = new CarBooking("0000BBB");
        cb.book(new Date());
        cb.getTicketDetail();
        cb.cancelBook();
        cb.getTicketDetail();

        FlightBooking fb= new FlightBooking("Iberia","122MLA");
        fb.book(new Date(),"V72", "patata", "marcelo");
             //deja poner patata,marcelo, porque el "args.length > 0"
        fb.book(new Date(), "V77");
        fb.getTicketDetail();
    }
}