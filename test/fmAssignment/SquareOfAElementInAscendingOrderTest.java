package fmAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareOfAElementInAscendingOrderTest {

    @Test
    public void squareOfElementInAnArray(){
        int [] inputArray = {10,8,6,4,2};
        int [] outputArray = {4, 16,36,64,100};
        assertArrayEquals(outputArray,SquareOfAElementInAscendingOrder.squareOfElement(inputArray));
    }

}