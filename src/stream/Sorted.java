package stream;

import java.util.Comparator;
import java.util.List;

public class Sorted {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(100,2,30,4,5,1);

        Comparator<Integer> comparator = (a,b)-> compare(a, b);
       List<Integer> integers =  numbers.stream()
                                        .sorted(comparator)
                                        .toList();
        System.out.println(integers);
    }

    private static int compare(Integer a, Integer b) {
        if (b > a) return 1;
        else if (a > b) return -1;
        return 0;
    }
}
