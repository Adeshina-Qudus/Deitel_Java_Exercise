package chapter15.iostreams.byteBase;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {

    public static void main(String[] args) {
        String location = "C:\\Users\\USER\\IdeaProjects\\trying\\src\\chapter15\\iostreams\\byteBase\\fileInputStreamExample.txt";
        try(PrintStream outputStream = new
                PrintStream(location)){
                System.setOut(outputStream);
            System.out.println("hello everybody");
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }

        PrintStream printStream = new PrintStream(System.out);
        printStream.println("hey");
    }
}
