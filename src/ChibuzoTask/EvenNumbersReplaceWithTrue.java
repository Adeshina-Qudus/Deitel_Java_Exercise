package ChibuzoTask;

import java.util.Arrays;

public class EvenNumbersReplaceWithTrue {
    public static boolean[] evenNumberReplaceWithTrue(int[] input) {
        boolean [] zerosAndOne = new boolean[input.length];
        for (int count = 0 ; count < input.length;count++){
            zerosAndOne[count] = input[count] % 2 == 0;
        }
        return zerosAndOne;
    }

}


