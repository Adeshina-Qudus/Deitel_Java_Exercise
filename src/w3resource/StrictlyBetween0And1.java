package w3resource;

import java.util.Scanner;

public class StrictlyBetween0And1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter number ");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber <= 1 && secondNumber <= 1);

    }
}
