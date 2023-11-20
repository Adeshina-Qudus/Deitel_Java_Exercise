package tdd.LeetCodeTdd;

import LeetCode.IndexOfTheFirstOccurrenceInAString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexOfTheFirstOccurrenceInAStringTest {


    @Test
    public void firstOccurrenceOfNeedleInHaystackTest(){
        String haystack = "sadbutsad";
        String needle = "sad";
        assertEquals(0, IndexOfTheFirstOccurrenceInAString.indexFirstOccurrence(haystack,needle));
    }

    @Test
    public void firstOccurrenceOfNeedleInHaystackTestTwo(){
        String haystack = "leetcode";
        String needle = "leeto";
        assertEquals(0, IndexOfTheFirstOccurrenceInAString.indexFirstOccurrence(haystack,needle));
    }


}