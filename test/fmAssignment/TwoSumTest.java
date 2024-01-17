package fmAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {



    @Test
    public void twoSumTest(){
        int [] inputArray = {1,2,3,4};
        int lowerBound = 2;
        int upperBound = 4;
        assertEquals(7,TwoSum.twoSum(inputArray,lowerBound,upperBound));
    }

}