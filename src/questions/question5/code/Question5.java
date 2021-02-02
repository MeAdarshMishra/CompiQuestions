package questions.question5.code;

import java.util.regex.Pattern;

public class Question5 {
    private static final String WHITESPACE = " ";

    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("[ ]+");

    public static String reverseWord(String word) {
        return "";
    }

    public static String reverseSentence(String sentence) {
        return "";
    }

    public static String reverseSentenceAndAllWords(String sentence) {
        return "";
    }

    public static void main(String[] args) {
        String sentence = "Java is a wonderful general-purpose programming language!";
        String word = sentence.split("\\w+")[0];
        System.out.println("reverseWord(word) = " + reverseWord(word));
        System.out.println("reverseSentence(sentence) = " + reverseSentence(sentence));
        System.out.println("reverseSentenceAndAllWords(sentence) = " + reverseSentenceAndAllWords(sentence));
    }
}
