package ChibuzoTask;

import java.util.Arrays;

public class ZerosAndOnes {
    public static int[] zerosAndOns(int[] input) {
        int [] zerosAndOne = new int[input.length];
        for (int count = 0 ; count < input.length;count++){
            if (input[count] % 2 == 0) {
                zerosAndOne[count] = 0;
            }else {
                zerosAndOne[count] = 1;
            }
        }
        return zerosAndOne;
    }

//    public static int[] zerosAndOnes(int[] input) {
//        return Arrays.stream(input).filter((x) -> x % 2==0).map(x->input[x] = 0).forEach((x) -> x);
//    }
}

