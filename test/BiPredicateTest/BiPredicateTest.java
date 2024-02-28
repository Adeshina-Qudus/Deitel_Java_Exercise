package BiPredicateTest;

import chapter17.lamdas.BiPredicateExample;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class BiPredicateTest {
    @Test
    public void biPredicateTest(){
        Integer firstNumber = 9;
        Integer secondNumber = 10;
        assertFalse(BiPredicateExample.biPredicate(firstNumber,secondNumber));
    }

}
