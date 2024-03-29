package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSample {
    public static void createFile(String location,String filename) {
        Path path = Path.of(location,filename);
        try {
            Files.createFile(path);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }

    public static void createDirectory(String location) {
        Path path = Path.of(location);
        try {
            Files.createDirectory(path);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void deleteFile(String location,String filename) {
        Path path = Path.of(location,filename);
        try {
            Files.delete(path);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void deleteDirectory(String location) {
        Path path = Path.of(location);
        try{
            Files.deleteIfExists(path);
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
