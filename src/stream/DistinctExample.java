package stream;

import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {

        List<Integer> integers = List.of(5,7,8,9,5,30,100,90);

        List<Integer> integerList = integers.stream()
                                            .sorted()
                                          .distinct()
                                            .toList();
        System.out.println(integerList);
    }
}
