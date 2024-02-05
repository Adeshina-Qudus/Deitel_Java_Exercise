package fmAssignment;

public class TwoSum {


    public static int twoSum(int[] inputArray, int lowerBound, int upperBound) {
        int total = 0 ;
        for (int outter = 0; outter < inputArray.length; outter++) {
            total = getTotal(inputArray, lowerBound, outter, total);
            if (lowerBound == upperBound) {
                break;
            }
            lowerBound++;
        }
        return total;
    }
    private static int getTotal(int[] inputArray, int lowerBound, int outter, int total) {
        for (int inner = 0; inner < inputArray.length; inner++) {
            if (inputArray[outter] == inputArray[inner]){
                break;
            }
            if (inputArray[outter] + inputArray[inner] == lowerBound) {
                total += lowerBound;
            }
        }
        return total;
    }
}
