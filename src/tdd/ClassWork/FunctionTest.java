package tdd.ClassWork;

import ClassWork.Function;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    public void testInputNumbers(){
        int [] array = {42,15,18,12,13,3};
        int [] result = {42,15,12,18,13,3};
        assertArrayEquals(result, Function.function(array));
    }

}