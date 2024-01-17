package fmAssignment;

import java.util.ArrayList;
import java.util.List;

public class ElementInThirdPosition {

    public static int[] elementInOddlyPosition(int[] inputArray) {
        List<Integer> integerList = new ArrayList<>();
        int oddlyPlaced = 1;
        for (int count = 0 ; count < inputArray.length; count++){
            oddlyPlaced += count;
            if (oddlyPlaced % 2 != 0) {
                integerList.add(inputArray[count]);
            }
            oddlyPlaced = 1;
        }
        return oddlyPosition(integerList);
    }
    private static int[] oddlyPosition(List<Integer> integerList) {
        int[] array = new int[integerList.size()];
        for (int count = 0; count < integerList.size(); count++){
            array[count] = integerList.get(count);
        }
        return array;
    }
}
