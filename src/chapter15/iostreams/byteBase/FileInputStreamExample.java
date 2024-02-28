package chapter15.iostreams.byteBase;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    /**
     * To create an io stream object you just need to call a constructor of one of the io stream object
     * the fileInputStream object will read from the location pass through it
     * The readAllBytes method returns a byte array
     */
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\USER\\IdeaProjects\\trying\\src\\MrChibuzoAssignment\\CreditCardValidator.java";
        try(FileInputStream fileInputStream =
                    new FileInputStream(fileLocation)){
            byte[] bytes = fileInputStream.readNBytes(10);
            System.out.println(new String(bytes));
            fileInputStream.skip(-bytes.length);
            byte[] bytes1 = fileInputStream.readAllBytes();
            System.out.println(new String(bytes1));

        }catch (IOException exception){
            exception.printStackTrace();;
        }

    }
}
