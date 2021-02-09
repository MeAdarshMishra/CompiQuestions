package questions.question6.code;

import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Question6 {

    /**
     * Returns a stack that is filled with the characters in "string".
     *
     * @return a Deque of characters from the "string".
     */
    private static Deque<Character> fillStack(String string) {
        var stackOfCharacters = new ArrayDeque<Character>();
        for (int i = 0; i < string.length(); i++) {
            stackOfCharacters.push(string.charAt(i));
            ;
        }
        return stackOfCharacters;
    }

    /**
     * Calls fillStack to fill the stack based on "string" and
     * returns a new string formed by popping each character from this
     * stack and joining the characters. Empties the stack
     *
     * @return the reversed string.
     */
    private static String buildReverseString(String string) {
        var stackOfCharacters = fillStack(string);
        var stringBuilder = new StringBuilder();
        while (!stackOfCharacters.isEmpty()) {
            var character = stackOfCharacters.pop();
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }

    /**
     * Returns true if "string" and the string built by buildReverse
     * have the same contents, except for case. Otherwise, returns false
     *
     * @return true if the "string" and its reverse are the same, otherwise, false.
     */
    public static boolean isPalindrome(String string) {
        return string.equalsIgnoreCase(buildReverseString(string));
    }


    /**
     * This method prints the output as a "Dialog Box".
     */
    private static void printMessageAsDialog(String inputString, int messageType) {
        JOptionPane.showMessageDialog(
                null,
                "'" + inputString + "' " +
                        (isPalindrome(inputString) ? "is a " : "is not a ")
                        + "palindrome.",
                "PALINDROME FINDER",
                messageType
        );
    }

    public static void main(String[] args) {
        var inputString = JOptionPane.showInputDialog(
                null,
                "Please input a string",
                "INPUT STRING",
                JOptionPane.PLAIN_MESSAGE
        );
        if (isPalindrome(inputString)) {
            printMessageAsDialog(inputString, JOptionPane.INFORMATION_MESSAGE);
        } else {
            printMessageAsDialog(inputString, JOptionPane.ERROR_MESSAGE);
        }
    }
}

