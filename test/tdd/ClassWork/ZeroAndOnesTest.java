package tdd.ClassWork;

import ChibuzoTask.ZerosAndOnes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ZeroAndOnesTest {



    @Test
    public void test(){
        int [] input = {4,5,8,8,8,2,9};
        int [] output = {0,1,0,0,0,0,1};
        assertArrayEquals(output, ZerosAndOnes.zerosAndOns(input));
    }

}
