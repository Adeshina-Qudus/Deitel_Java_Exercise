package fmAssignment;

public class SquareOfAElementInAscendingOrder {

    public static int[] squareOfElement(int[] inputArray) {
        for (int count = 0 ; count < inputArray.length; count++){
            inputArray[count] = inputArray[count] * inputArray[count];
        }
        return sort(inputArray);
    }
    private static int[] sort(int[] inputArray){
        for (int outter = 0 ; outter < inputArray.length; outter++){
            for (int inner = 0; inner < inputArray.length; inner++){
                if (inputArray[outter] < inputArray[inner]){
                    int temp = inputArray[inner];
                    inputArray[inner] = inputArray[outter];
                    inputArray[outter] = temp;
                }
            }
        }
        return inputArray;
    }
}
