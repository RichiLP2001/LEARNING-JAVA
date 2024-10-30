package com.campusdual.iofiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFiles {
    public static void main(String[] args) {
        Path filePath = Paths.get(Route.PATH_NAME);
        try{
            //los elimina en caso de que existan
            Files.deleteIfExists(filePath);
            System.out.println("File deleted.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
