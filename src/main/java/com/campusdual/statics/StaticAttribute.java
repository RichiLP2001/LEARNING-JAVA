package com.campusdual.statics;

public class StaticAttribute {
    public static int totalCounter= 0;

    public void incrementAndPrintCounter(){
            //señalamos especificamente que "totalCounter" queremos referir-->
        StaticAttribute.totalCounter++;
        System.out.println("Counter: " + StaticAttribute.totalCounter);


    }
}
