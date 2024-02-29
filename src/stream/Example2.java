package stream;

import java.util.List;

public class Example2 {
    public static void main(String[] args) {

        Integer result = List.of(10,20,30,40)
                .stream()
                .mapToInt((number) -> number)
                .sum();
        System.out.println(result);
    }
}
