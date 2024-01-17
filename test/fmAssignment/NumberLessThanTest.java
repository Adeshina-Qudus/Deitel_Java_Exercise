package fmAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberLessThanTest {
    @Test
    public void numberLessThanTest(){
        int [] inputArray = {1,3,2,7};
        int [] outputArray = {0,2,1,3};
        assertArrayEquals(outputArray,NumberLessThan.numberLessThan(inputArray));
    }
}