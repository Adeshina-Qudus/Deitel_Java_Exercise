package stream;

import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        String result = (List.of(10,20,30,40)
                .stream()
                .map((String :: valueOf))
                .reduce(String::concat)).orElseThrow();
        System.out.println(result);

    }
}
