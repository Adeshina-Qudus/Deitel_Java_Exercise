package Chapter7;

import java.util.ArrayList;

public class FibonacciSeries {


    public static void main(String[] args) {
        System.out.println(fibonacciSeries(777));
    }

    public static ArrayList<Integer> fibonacciSeries(int inputNumber) {
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(firstNumber);
        for (int count = 0; count < inputNumber; count++) {
            sum = firstNumber + secondNumber;
            if (sum > inputNumber) {
                break;
            }
            result.add(sum);
            secondNumber = firstNumber;
            firstNumber = sum;
        }
        return result;
    }
}


