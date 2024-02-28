package chapter15.iostreams.byteBase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    /**
     * this stream will be writhing to a file
     * the write method is overloaded
     * @param args
     */
    public static void main(String[] args)  {

        String location = "C:\\Users\\USER\\IdeaProjects\\trying\\src\\chapter15\\iostreams\\byteBase\\fileInputStreamExample.txt";
        try(FileOutputStream outputStream = new FileOutputStream(location,true)){
            String outputData = "Forca Barce";
            outputStream.write(outputData.getBytes());
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
