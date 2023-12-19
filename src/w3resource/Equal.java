package w3resource;

import java.util.Scanner;

public class Equal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter number ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter number ");
        int thirdNumber = scanner.nextInt();
        System.out.println("Enter number ");
        int fourthNumber = scanner.nextInt();

        if (firstNumber == secondNumber &&firstNumber ==thirdNumber && firstNumber == fourthNumber){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
