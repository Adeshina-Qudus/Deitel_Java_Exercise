package fmTask;

public class PositionOfElementInArrayInAscOrder {
    public static int[] positionOfElementInArrayInAscOrder(int[] input) {
        int [] result = new int[input.length];
        int counter = 0;
        for (int outterLoop = 0; outterLoop < input.length; outterLoop++){
            for (int innerLoop = 0; innerLoop < input.length;innerLoop++){
                if (input[outterLoop] > input[innerLoop]){
                    counter++;
                }
            }
            result[outterLoop] = counter + 1;
            counter = 0;
        }
        return result;
    }
}
