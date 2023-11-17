package LeetCode;

import java.util.AbstractList;
import java.util.ArrayList;

public class RemoveElementAndReturnNumberOfElementRemaining {

    public static int[] removeDuplicateOfGivenValue(int[] array, int value){
        ArrayList<Integer> removeDuplicate = new ArrayList<>();
        for (int i : array) {
            if (i != value) {
                removeDuplicate.add(i);
            }
        }
        return returnArray(removeDuplicate);
    }

    public static int [] returnArray(ArrayList<Integer> arrayList){
        int [] arrayLength = new int[arrayList.size()];
        for (int count = 0 ; count < arrayList.size(); count++){
            arrayLength[count] = arrayList.get(count);
        }
        return arrayLength;
    }

    public static int numberOfElementLeft(int[] array, int value) {
        int [] arrayOutput = removeDuplicateOfGivenValue(array,value);
        return arrayOutput.length;
    }
}
