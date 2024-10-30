package com.campusdual.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Calendar;

public class XMLFileCreator {
    private static void createDocument() throws TransformerException, ParserConfigurationException {
        //1º factoria: solicitamo un constructor de documentos
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         //Nos da el constructor
        DocumentBuilder builder = factory.newDocumentBuilder();
            //Le digo l constructor-->devuelve un document abstracto
        builder.newDocument();
            //Guardo el documento abstracto en una variable tipo Document
        Document document = builder.newDocument();

        //3º
        Element root = document.createElement("computer");
            //appenchild--> ponme un hijo
            // , de ahora en adelante lasetiquetas colgaran de root
        document.appendChild(root);
        Element components = document.createElement("components");
        root.appendChild(components);

        //creamos un componente MANUALMENTEque cuelga la root "computer"-
            Element component = document.createElement("component");
            component.setAttribute("quantity","1");
            component.setTextContent("CPU");
            components.appendChild(component);

        //5º puedo crear componentes mas rapido con el metodo CreateItem
            components.appendChild(createItem(document,"component", "quantity","1","CPU"));
            components.appendChild(createItem(document, "component","quantity","2","RAM"));
            components.appendChild(createItem(document,"component","quantity","3","Fan"));
            components.appendChild(createItem(document,"component","quantity","4","Graphic card"));
            components.appendChild(createItem(document,"component","quantity","2","MotherCard"));
            components.appendChild(createItem(document,"component","quantity","2","SSD"));
            components.appendChild(createItem(document,"component","quantity","4","Power supply"));
            components.appendChild(createItem(document,"component","quantity","4","Compute Case"));
                    //6º quiero que me escribas este documento en esta ruta-->
            writeToFile(document, "src/main/resources/computerList.xml");


    }
            //7º
    private static void writeToFile(Document document, String pathFile) throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","3");
            //indicamos donde queremos crearlo
        File file = new File(pathFile);
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(file);
        transformer.transform(source,result);
    }

    //4º METODO- CREACION DE COMPONENTES
    public static Element createItem(Document document, String tagName, String attribute, String attrValue, String textComponent) {/*vamos a devolver un elemento*/
        Element component = document.createElement(tagName);
        component.setAttribute(attribute, attrValue);
        component.setTextContent(textComponent);
        return component;
    }


    public static void main(String[] args) throws TransformerException {
        try{
        // 2º creacion de objetos en otros elementos
        XMLFileCreator.createDocument();
        } catch (TransformerConfigurationException | ParserConfigurationException e){
            throw new RuntimeException(e);
        }
    }
}
