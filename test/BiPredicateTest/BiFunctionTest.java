package BiPredicateTest;

import chapter17.lamdas.BiFunctionSample;
import chapter17.lamdas.BiPredicateExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiFunctionTest {


    @Test
    public void biFunctionTest(){
        Integer firstNumber = 98;
        Integer secondNumber = 91;
        assertEquals(189, BiFunctionSample.biFunction(firstNumber,secondNumber));
    }
}
