package com.campusdual.statics;

import java.util.Calendar;
import java.util.Date;

public class StaticMethod {
    public static String countDownToYear(String name, int year) {

                // vamos a devolver un mensaje, por lo tanto es String
                //definimos name y year porque queremos personalizar susvalores.
        Date today = new Date(); //<-- creamos un objeto "Date"
                //"Date" marca el tiempo y debe dejar
                // la coletilla import java.util.Date en el inicio de la clase
        Calendar calendar = Calendar.getInstance();
                //nuevo metodo de clase "Calendar.getInstance" --> da calendario de fecha actual.
        calendar.set(year, 0, 1, 0, 0, 0);
                // permite definir la fecha a mostrar del calendario
        Date targetDate = calendar.getTime();
                //toma la fehca de calendario señalada en calendar.set
        long millis = targetDate.getTime() - today.getTime();
        long days = millis / (1000*60*60*24); // aqui estamos convirtiendo de milisegundos a días.
        if (days > 0){
            return "Hi "+name+"!, countdown "+ year +": "+days+" days.";
        } else {
            return "Hi "+name+"!, days from year "+ year +": "+ Math.abs(days) +" days.";
                    //El Math.abs(days) hace que los numeros que resulten de days sean en valor absoluto.
        }
            //no hemos impreso de momento lo que este metodo genera, por lo tanto lo hara pero no lo mostrara

    }

    public static void main(String[] args) {
            //aca ya imprimimos el resultado del metodo countDownToYear
        String message = countDownToYear( "Ricardo", 2024);
        System.out.println(message);
            //otra manera de imprimirlo-->
        System.out.println(countDownToYear("Ricardo", 2024));
            //la manera perfecta -->
        System.out.println(StaticMethod.countDownToYear("Ricardo", 2024));
    }
}


