package fmAssignment;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumbersWithSpaceTest {

    @Test
    public void lowestAndHighestTest(){
        String numbers = "6 3 -9 7 2";
        int [] lowestAndHighest = {2,9};
        assertArrayEquals(lowestAndHighest,NumbersWithSpace.turningIntoAnInt(numbers));
    }

}