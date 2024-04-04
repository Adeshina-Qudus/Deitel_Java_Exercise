package tdd;

import ChibuzoTask.LowestCommonMultiple;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonMultipleTest {


    @Test
    void divisorResultTest(){
        int [] numbers = {8,16,12};
        int result = 48;
        assertEquals(result,LowestCommonMultiple.lcm(numbers));
    }

    @Test
    void lcmTest(){
        int [] numbers = {10,18,20};
        int result = 180;
        assertEquals(result, LowestCommonMultiple.lcm(numbers));
    }

}