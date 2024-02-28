package chapter17.lamdas;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate = (firstNumber, secondNumber) -> firstNumber > secondNumber;
        System.out.println(biPredicate.test(3, 4));
    }

    public static boolean biPredicate(Integer firstNumber, Integer secondNumber) {
        BiPredicate<Integer,Integer> biPredicate =
                (first,second) -> first > second;
        return biPredicate.test(firstNumber,secondNumber);
    }
}
