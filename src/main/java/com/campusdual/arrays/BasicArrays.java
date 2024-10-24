package com.campusdual.arrays;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class BasicArrays {
    public static void main(String[] args) {
        //para crearun array
        // --> [3]-indico que el tamaño sera de 3 posiciones.
        int[] firstIntArray = new int[3];

        //--> para este array firstarray,
        // en la posicion [0]--> tomara un valor de =15
        firstIntArray[0] = 15;
        firstIntArray[1] = 17;
        firstIntArray[2] = 19;

        //--> creamos un array en el que ya asignamos
        //el tamaño al definir el valor que tomara cada decision.
        String[] firstStringArray = {"A", "B", "C", "D"};

        System.out.println("First int array lenght: " + firstIntArray.length);
        System.out.println("First String array lngth: " + firstStringArray.length);

        System.out.println("First int array position value: " + firstIntArray[0]);
        System.out.println("First String array position value: " + firstStringArray[0]);

        //Para ver siempre el valor del ULTIMO INDICE
        System.out.println("First int array position value: " + firstIntArray[firstIntArray.length - 1]);
        System.out.println("First String array position value: " + firstStringArray[firstStringArray.length - 1]);

        //BUCLE FOR:
        System.out.println("Loop through first int array: ");
        //i MENOR a la longitud del array que quiero recorrer.
        for (int i = 0; i < firstIntArray.length; i++) {
            //para imprimir valores ed array en columna-->
            //-->System.out.println(firstIntArray[i]);
            //para imprimir los numeros de los arrays en fila(horizontal)
            System.out.print(firstIntArray[i] + " ");
        }
        System.out.println();

        System.out.println("Loop through first string array: ");
        //i MENOR a la longitud del array que quiero recorrer.
        for (int i = 0; i < firstStringArray.length; i++) {
            //para imprimir valores ed array en columna-->
            //-->System.out.println(firstIntArray[i]);
            //para imprimir los numeros de los arrays en fila(horizontal)
            System.out.print(firstStringArray[i] + " ");
        }

        System.out.println("\n");

        //CREACION DE MATRIZ
        int maxi = 3;
        int maxj = 3;
        int value=0;

        int[][] secondIntArray = new int[maxi][maxj];
        //--> asignacion de valor a indices MANUAL a la MATRIZ.
            /*secondIntArray[0][0]=1;
            secondIntArray[1][2]=1;*/

     //-->Aisgnacion de VALORES a indices de MATRIZ con BUCLE(automatico).
        for (int i=0; i<maxi;i++){
            for(int j=0;j<maxj;j++){
                value++;
                secondIntArray[i][j]=value;
            }
        }
            //-->aqui imprimimos los valores de la matriz
        for (int i=0; i<maxi;i++) {
            for (int j = 0; j < maxj; j++) {
                System.out.print(secondIntArray[i][j] + " ");
            }
            System.out.println();
        }
        //--> un espacio
        System.out.println("\n");

      //--> OTRA MANERA DE HACER MATRIZ CON STRING
        String[][] secondStringArray = {{"A","B","C","D"},{"E","F","G","H"},{"I","J","K","L"}};
        for (int i=0; i<secondStringArray.length;i++) {
            for (int j = 0; j < secondStringArray.length; j++) {
                System.out.print(secondStringArray[i][j]+ " ");
            }
            System.out.println();
        }


        }
}
