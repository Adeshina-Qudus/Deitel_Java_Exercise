package LeetCode;

public class IndexOfTheFirstOccurrenceInAString {


    public static int indexFirstOccurrence(String haystack, String needle){
        for (int count = 0 ; count < haystack.length(); count++){
            if (haystack.charAt(count) == needle.charAt(count)){
                return count;
            }
        }
        return - 1;
    }
}
