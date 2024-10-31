package com.campusdual.json;

import com.campusdual.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JsonFileCreator {
    // 1ºcreacion del json
    private static void createFile(){
        JsonObject computer = new JsonObject();
        JsonArray componentsArray = new JsonArray();
            //4º utilizamos metodo para crear
        componentsArray.add(JsonFileCreator.createItem(2,"Graphic card"));
        componentsArray.add(JsonFileCreator.createItem(1,"CPU"));
        componentsArray.add(JsonFileCreator.createItem(3,"Fan"));
        componentsArray.add(JsonFileCreator.createItem(2,"Motherboard"));
        componentsArray.add(JsonFileCreator.createItem(2,"RAM"));
        componentsArray.add(JsonFileCreator.createItem(2,"SSD"));
        componentsArray.add(JsonFileCreator.createItem(1,"Power Supply"));
        componentsArray.add(JsonFileCreator.createItem(1,"Computer Case"));
        //PASO 6º--> para terminar
        computer.add("components",componentsArray);

        //5º --> para imprimir el contenido del Json
        try(FileWriter fw = new FileWriter("src/main/resources/example.json")) {
            // 5.1)-->IMPRIMIR SIN FORMATO
            //fw.write(computer.toString());
            //}catch (IOException e){
            //e.printStackTrace();
            //}
            //5.2) --> IMPRIMIR CON FORMATO en Json
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(computer);
            fw.write(json);
            fw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

        /*
            // 2ºCreamos el primer componente
        JsonObject component1 = new JsonObject();
            //"addProperty"=agregamos clave  valor a component1
        component1.addProperty("quantity",2);
        component1.addProperty("text","RAM");
            //Agregamos el component 1 dentro de COMPONENTS
        componentsArray.add(component1);*/
    }

    //3ºMETODO - creacion de componentes mas automatizado
    private static JsonObject createItem(int quantity, String itemDesc){
        JsonObject component = new JsonObject();
        component.addProperty("quantity",quantity);
        component.addProperty("text",itemDesc);
        return component;
    }

    public static void main(String[] args) {
        createFile();
    }

}
