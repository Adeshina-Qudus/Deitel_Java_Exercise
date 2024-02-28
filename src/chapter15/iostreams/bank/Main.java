package chapter15.iostreams.bank;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String location = "C:\\Users\\USER\\IdeaProjects\\trying\\src\\chapter15\\iostreams\\bank\\transaction.txt";
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("qudus","lekan", BigDecimal.valueOf(4000).toString()));
        transactions.add(new Transaction("ope","Dd", BigDecimal.valueOf(2000).toString()));
        transactions.add(new Transaction("Tobi","ope", BigDecimal.valueOf(2000).toString()));
        writeTransactionTo(transactions,location);
    }

    private static void writeTransactionTo(List<Transaction> transactions,String fileLocation){
        try (FileOutputStream fileOutputStream =
                new FileOutputStream(fileLocation,true)){
            String trans = "\n"+transactions.toString();
            fileOutputStream.write(trans.getBytes());
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
