package com.campusdual.statics;

import java.util.Calendar;
import java.util.Date;

public class StaticMethod {
    public static void main (String[] args) {
    }
    public  Calendar countDownToYear(String name, int year) { //
        // vamos a devolver un mensaje, por lo tanto es String
        //definimos name y year porque queremos personalizar susvalores.
        Date today = new Date(); //<-- creamos un objeto "Date"
        //"Date" marca el tiempo y debe dejar
        // la coletilla import java.util.Date en el inicio de la clase
        Calendar calendar = Calendar.getInstance();
        //nuevo metodo de clase "Calendar.getInstance" --> da calendario de fecha actual.
        calendar.set(year, 0, 1, 0, 0, 0);
        // permite definir la fecha a mostar del calendario
        Date targetDate = calendar.getTime();
        return calendar;

    }
}


