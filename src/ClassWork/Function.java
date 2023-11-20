package ClassWork;

import java.util.Arrays;

public class Function {


    public static int[] function(int[] array) {
        int divide = array.length / 2;
        for (int count = 0 ; count < array.length; count++) {
            if (array.length % 2 == 0) {
                array[divide - 1] = array[divide + 1];
                array[divide + 1] = array[divide - 1];
            }
            if (array.length % 2 != 0) {
                array[divide - 1] = array[divide];
                array[divide] = array[divide - 1];
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
