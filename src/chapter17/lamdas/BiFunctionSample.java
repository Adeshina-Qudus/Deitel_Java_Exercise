package chapter17.lamdas;

import java.util.function.BiFunction;

public class BiFunctionSample {

    public static int biFunction(Integer firstNumber, Integer secondNumber) {
        BiFunction<Integer,Integer,Integer>  biFunction = Integer::sum;
        return biFunction.apply(firstNumber,secondNumber);
    }
}
