import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexExampleTest {

    @Test
    public void test(){
        String [] arrayInput = {"Cat","goat","ram","calf"};
        String [] output = {"Cat","calf"};
        assertArrayEquals(output,RegexExample.regex(arrayInput));
    }

}