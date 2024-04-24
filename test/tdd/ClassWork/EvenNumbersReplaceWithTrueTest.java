package tdd.ClassWork;

import ChibuzoTask.EvenNumbersReplaceWithTrue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EvenNumbersReplaceWithTrueTest {


    @Test
    public void test(){
        int [] input = {4,5,8,8,8,2,9};
        boolean [] output = {false,true,false,false,false,false,true};
        assertArrayEquals(output, EvenNumbersReplaceWithTrue.evenNumberReplaceWithTrue(input));
    }

}
