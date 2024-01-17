package fmAssignment;

import java.util.ArrayList;

public class NumbersWithSpace {


    public static int [] turningIntoAnInt(String numbersWithSpace) {
        ArrayList<String> integerArrayList = new ArrayList<>();
        for (int count = 0 ; count < numbersWithSpace.length(); count++){
            if (!String.valueOf(numbersWithSpace.charAt(count)).equals(" "))
                integerArrayList.add(String.valueOf(numbersWithSpace.charAt(count)));
        }
            return lowestAndHighest(integerArrayList);
        }
    private static int[] lowestAndHighest(ArrayList<String> integerArrayList){
        int [] array = new int[2];
        int smallest = Integer.parseInt(integerArrayList.get(0));
        int highest = 0;
        for (int count = 0 ; count < integerArrayList.size(); count++){
            if (Integer.parseInt(integerArrayList.get(count)) < smallest){
                smallest = Integer.parseInt(integerArrayList.get(count));
            }
            if (Integer.parseInt(integerArrayList.get(count)) > highest){
                highest = Integer.parseInt(integerArrayList.get(count));
            }
        }
        array[0] = smallest;
        array[1] = highest;
        return array;
    }
}
