package com.campusdual.statics;

public class UseOfStatic {
    public static void main(String[] args) {
        System.out.println("Static Method: ");
        System.out.println("=================");
        System.out.println(StaticMethod.countDownToYear("Pablo", 2222));
        System.out.println(StaticMethod.countDownToYear("Pablo", 1990));
        System.out.println("Static Attribute: ");
        System.out.println("=================");
        StaticAttribute sta1 = new StaticAttribute();
        StaticAttribute sta2 = new StaticAttribute();
        StaticAttribute sta3 = new StaticAttribute();
        //independientemente de cual de los sta1 activo primero, siempre contara de uno en uno, porque
        //StaticAttribute tiene un static que solo va a centrarse a contar sobre si mismo
        sta1.incrementAndPrintCounter();
        sta2.incrementAndPrintCounter();
        sta3.incrementAndPrintCounter();

    }
}
