package fmAssignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemovingVowelsTest {


    @Test
    public void removingVowels(){
        String input = "semicolon";
        assertEquals("smcln",RemovingVowels.removingVowels(input));
    }

}