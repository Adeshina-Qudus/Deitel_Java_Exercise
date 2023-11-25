package Chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciSeriesMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                ENTER A NUMBER TO GET THE FIBONACCI SERIES
                NUMBER MUST BE NO GO BEYOND 10,000
                """);
        int userInput = input.nextInt();
        while (userInput > 10000) {
            try {
                userInput = input.nextInt();
                System.out.println("ENTER A VALID NUMBER");
            } catch (InputMismatchException ignored) {
                System.out.println("ENTER A VALID NUMBER");
            }
        }
        System.out.println(FibonacciSeries.fibonacciSeries(userInput));
    }
}
