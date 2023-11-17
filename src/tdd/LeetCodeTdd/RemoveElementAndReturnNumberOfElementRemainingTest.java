package tdd.LeetCodeTdd;

import LeetCode.RemoveElementAndReturnNumberOfElementRemaining;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementAndReturnNumberOfElementRemainingTest {

    @Test
    public void testThatCanRemoveDuplicateOfAGivenValue(){
        int [] array = {3,2,2,3};
        int value = 3;
        assertArrayEquals(new int[]{2,2}, RemoveElementAndReturnNumberOfElementRemaining.removeDuplicateOfGivenValue(array,
                value));
    }
    @Test
    public void testThatRemoveDuplicateOfGivenValue_AndNumbersOfElementLeft(){
        int [] array = {3,2,2,3};
        int value = 3;
        assertEquals(2,RemoveElementAndReturnNumberOfElementRemaining.numberOfElementLeft(array,value));
    }
    @Test
    public void testThatRemoveDuplicateOfGivenValue_AndNumbersOfElementLeftT(){
        int [] array = {0,1,2,2,3,0,4,2};
        int value = 2;
        assertEquals(5,RemoveElementAndReturnNumberOfElementRemaining.numberOfElementLeft(array,value));
    }
}