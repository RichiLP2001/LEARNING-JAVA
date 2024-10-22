package com.campusdual.Interfaces;

import java.util.Date;

public class BookingSystem {
    public static void main(String[] args) {
        CarBooking cb = new CarBooking("0000BBB");
        cb.book(new Date());
        cb.getTicketDetail();
        cb.cancelBook();
        cb.getTicketDetail();
    }
}
