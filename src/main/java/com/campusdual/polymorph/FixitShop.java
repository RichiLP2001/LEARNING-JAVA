package com.campusdual.polymorph;

public class FixitShop {
    public static void main(String[] args) {
        Device s1 = new Smarthphone("pcom", "X4");
        Device t1 = new Tablet("Xiaomi", "Pad 6");
        Device l1 = new Laptop("Xiaomi", "Pad 6");

        s1.turnOn();
        t1.turnOn();
        l1.turnOn();

        s1.turnOff();
        t1.turnOff();
        l1.turnOff();

        IChargeable s2 = new Smarthphone("Samsung","S20");
        IChargeable t2 = new Tablet("samsung","Notebook");
        IChargeable l2 = new Laptop("ASUS","RRRTTT");

        s2.charge();
        t2.charge();
        l2.charge();

        s2.use();
        t2.use();
        l2.use();

        Device s3 = new Smarthphone("iphone","X10");
        IChargeable t3 = new Tablet("iPad","Mini 2");
        Device l3 = new Laptop("HP","X3000");

        ((Smarthphone)s3).makeACall();
        ((Device)t3).turnOn();
        // si intento "l3.use();" --> no deja
        ((IChargeable)l3).use();





    }
}
