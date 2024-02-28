package chapter15.iostreams.byteBase;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class DataInputStreamExample {

    public static void main(String[] args) {
        String location = "C:\\Users\\USER\\Pictures\\Screenshots\\html.png";
       try (DataInputStream dataInputStream = new DataInputStream(
               new FileInputStream(location)
       )){
           byte [] bytes = dataInputStream.readAllBytes();
           System.out.println(new String(bytes));
       }catch (IOException exception){
           System.err.println(exception.getMessage());
       }
    }
}
