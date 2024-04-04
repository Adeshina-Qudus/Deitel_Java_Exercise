package ChibuzoTask;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonMultiple {
    public static int lcm(int... numbers) {
        int divisor = 2;
        List<Integer> result  = new ArrayList<>();
        int divideTo = 0;
        int successfullyDivided = 0 ;
        int counterOfOne = 0;
        int whenTOAddDivisor = 0;
        boolean condition = true;
        while (condition){
            for (int count = 0 ; count < numbers.length; count++){
                if (numbers[count] % divisor == 0) {
                    divideTo = numbers[count] / divisor;
                    numbers[count] = divideTo;
                    successfullyDivided++;
                    whenTOAddDivisor ++;
                }
                if (numbers[count] == 1){
                    counterOfOne++;
                }
            }
            if (successfullyDivided == 0){
                divisor++;
            }
            if (counterOfOne == numbers.length){
                condition = false;
            }
            counterOfOne = 0;
            if (whenTOAddDivisor>=1) {
                result.add(divisor);
            }
            whenTOAddDivisor = 0 ;
            successfullyDivided = 0;
        }
        return getFactorialOfDivisor(result);
    }

    private static int getFactorialOfDivisor(List<Integer> result) {
        int multiplyBy = 1;
        for (int element : result){
            multiplyBy = multiplyBy * element;
        }
        return multiplyBy;
    }

}
