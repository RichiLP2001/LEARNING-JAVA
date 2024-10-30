package com.campusdual.iofiles;

import com.campusdual.Utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Writer {
    public static void main(String[] args) {
        //creamos una variable Path
        Path filePath = Paths.get(Route.PATH_NAME);
        //vamos a definir elementos que queremos que se cierren.
            //Aqui indicamos la ubicacion en donde queremos que escriba
        try(PrintWriter pw = new PrintWriter(new FileWriter(filePath.toFile()))){
                //Aqui le indicamos que escriba 10
                // numeros aleatorios en la localizacion indicada previamente
            for(int i = 0; i<10; i++){
                int random = Utils.getRandomNumberInRange(1,100);
                pw.println(random);
            }
            // pw.println("Hola. Este es como almaceno una cadena");
        }catch (IOException e){
            e.printStackTrace();
        }

    }



}
