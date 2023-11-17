package tdd.LeetCodeTdd;

import LeetCode.PlusOneToLastDigitOfArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneToLastDigitOfArrayTest {

@Test
    public void testThatLastElementInAnArrayAddPlusOne(){
         int [] array = {2,9};
         assertArrayEquals(new int[] {2,1,0}, PlusOneToLastDigitOfArray.addOneToLastElement(array));
}
@Test
    public void testThatLastElementAddByOne(){
    int [] array = {4,3,2,1};
    assertArrayEquals(new int[] {4,3,2,2}, PlusOneToLastDigitOfArray.addOneToLastElement(array));
}
@Test
    public void testLastElement(){
    int [] array = {2,9,100};
    assertArrayEquals(new int[] {2,9,1,0,1}, PlusOneToLastDigitOfArray.addOneToLastElement(array));
}

}