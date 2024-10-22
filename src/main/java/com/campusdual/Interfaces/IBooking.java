package com.campusdual.Interfaces;
import java.util.Date;
public interface IBooking {
    void book (Date bookDate, String... args);
    void cancelBook();
    void getTicketDetail();

}
