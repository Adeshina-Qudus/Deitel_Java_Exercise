package fmAssignment;

public class RemovingVowels {


    public static String removingVowels(String input) {
        String vowels = "aeiou".toUpperCase();
        input = input.toUpperCase();
        String empty = "";
        String result = "";
        result = getNonVowels(input, vowels, empty, result);
        return result.toLowerCase();
    }

    private static String getNonVowels(String input, String vowels, String empty, String result) {
        for (int outter = 0; outter < vowels.length(); outter++){
            for (int inner = 0; inner < input.length(); inner++){
                if (vowels.charAt(outter) != input.charAt(inner)){
                    empty += String.valueOf(input.charAt(inner));
                }
            }
            input = empty;
            result = empty;
            empty = "";
        }
        return result;
    }
}
