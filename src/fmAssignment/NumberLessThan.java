package fmAssignment;

public class NumberLessThan {


    public static int[] numberLessThan(int[] inputArray) {
        int [] outputArray = new int[inputArray.length];
        int counter = 0 ;
        for (int outter = 0; outter < inputArray.length; outter++){
            for (int inner = 0 ; inner < inputArray.length; inner++){
                if (inputArray[outter] > inputArray[inner]){
                    counter++;
                }
            }
            outputArray[outter] = counter;
            counter = 0;
        }
        return outputArray;
    }
}
