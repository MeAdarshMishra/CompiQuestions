package answers.question3.code;

import java.util.HashMap;
import java.util.Map;

class Question3 {
    public static Map<Character, Integer> countDuplicateCharacters(String string) {
        var resultMap = new HashMap<Character, Integer>();
        // 1. use a loop to iterate the string, or use toCharArray() with for-each loop
        for (int index = 0; index < string.length(); index++) {

        }
        return resultMap;
    }

    public static void main(String[] args) {
        String message = "Competitive Programming Can Be A Little Bit Tricky!";
        System.out.println(countDuplicateCharacters(message));
    }
}

