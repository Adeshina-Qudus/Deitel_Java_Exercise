package LeetCode;

public class PlusOneToLastDigitOfArray {

    public static int[] addOneToLastElement(int[] array){
        StringBuilder result = new StringBuilder();
        for (int count = 0; count < array.length;count++){
            if (count == array.length -1) {
                array[count] += 1;
            }
            result.append(array[count]);
        }
        return addToLastElement(String.valueOf(result));
    }
    public static int [] addToLastElement(String input){
        int [] array = new int[input.length()];
        for (int count = 0 ; count < input.length(); count++){
            array[count] = Integer.parseInt(String.valueOf(input.charAt(count)));
        }
        return array;
    }
}
