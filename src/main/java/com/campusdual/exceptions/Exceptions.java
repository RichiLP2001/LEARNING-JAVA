package com.campusdual.exceptions;

public class Exceptions {
    //VAMOS A CREAR UN FALLO EN LOS METODOS AHORA
    public static int divisionByNumber(int a, int b)
    /*Agregamos palabra Throws*/ throws ByZeroException {
        //THROWS-->
        if(b==0){
            throw new ByZeroException("Cannot perform a division by 0.");
        }else{


        return a/b;}
    }


    public static void main(String[] args) {

//        int dividend = 3, divisor = 0;
//        int res = Exceptions.divisionByNumber(dividend,divisor);
//        System.out.println(res);
//        String greetigs = "Hello there!";
//        System.out.println(Integer.parseInt(greetigs));

        int dividend = 3, divisor = 0;
        try {
            int res = Exceptions.divisionByNumber(dividend, divisor);
        }catch (ArithmeticException e){
            System.err.println("Program failed." + e.getMessage());
                //imprimir la traza del error-->
                e.printStackTrace();
        }
        System.out.println("Program Finished.");





    }
}
