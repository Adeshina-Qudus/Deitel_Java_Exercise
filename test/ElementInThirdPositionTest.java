import FMassignment.ElementInThirdPosition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElementInThirdPositionTest {

    @Test
    public void returnElementInOddlyPositionTest(){
        int [] inputArray = {1,4,6,7,8,9,13,4,};
        int [] outputArray = {1,6,8,13};
        Assertions.assertArrayEquals(outputArray, ElementInThirdPosition.elementInOddlyPosition(inputArray));
    }
}