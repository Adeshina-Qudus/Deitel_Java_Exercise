package chapter15.iostreams.byteBase;

import chapter15.iostreams.bank.Transaction;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {

    public static void main(String[] args) {
        try(ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(
                        System.out
                )){
            Transaction transaction = new Transaction("Tobi","Ope","4555");
            objectOutputStream.writeObject(transaction);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
