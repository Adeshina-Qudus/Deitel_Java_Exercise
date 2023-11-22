package tdd;

import org.junit.jupiter.api.Test;

class IndicesTest {


    @Test
    public void testTargetBetweenIndices(){
        int number = 13579;
        int indices1 = 1;
        int indices2 = 2;
        int target = 4;
        assertTrue(Indices.indices(number,indices1,indices2,target));
    }
}