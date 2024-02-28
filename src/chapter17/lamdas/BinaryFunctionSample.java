package chapter17.lamdas;

import java.util.function.BinaryOperator;

public class BinaryFunctionSample {

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = Integer::sum;
        binaryOperator.apply(3,5);
    }
}
