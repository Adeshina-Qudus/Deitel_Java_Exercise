package tdd;

import ClassWork.SmallBig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallBigTest {


    @Test
    public void testNumbers(){
        int [] array = {42, 18, 41, 22, 15, 12};
        int [] result = {18, 42, 22, 41, 12, 15};
        assertArrayEquals(result, SmallBig.function(array));
    }
    @Test
    public void testNumbers2(){
        int [] array = {42, 18, 41, 22, 15};
        int [] result = {18, 42, 22, 41,15};
        assertArrayEquals(result, SmallBig.function(array));
    }

}