package tdd;

import org.junit.jupiter.api.Test;

class CountingIntInStringsTest {




    @Test

    public void testThatFunctionReturnNumbersInAString(){
        String [] characters = {"ABc20671f","13c9pz","A21l"};
        assertEquals(9, CountingIntInStrings.numbersInAString(characters));
    }

}