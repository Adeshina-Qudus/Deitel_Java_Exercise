package fmAssignment;

import fmTask.PositionOfElementInArrayInAscOrder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PositionOfElementInArrayInAscOrderTest {


    @Test
    public void test(){
        int [] input = {10,3,6};
        int [] output = {3,1,2};
        assertArrayEquals(output, PositionOfElementInArrayInAscOrder.positionOfElementInArrayInAscOrder(input));
    }
}
