package tdd;

import org.junit.jupiter.api.Test;

class SumOfDigitsTest {

    @Test
    public void testPositiveSumOfNumbers(){
        int number = 2345;
        assertEquals(14,SumOfDigits.sumDigits(number));
    }
    @Test
    public void testNegativeSumOfNumbers(){
        int number = -2345;
        assertEquals(14, SumOfDigits.sumDigits(number));
    }


}