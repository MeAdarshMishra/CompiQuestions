package questions.question6.code;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Question6Test {

    // this is an alternate approach to check a palindrome (USE AS HINT ONLY)
    boolean isPalindrome(String string) {
        return string.equalsIgnoreCase(new StringBuilder(string).reverse().toString());
    }

    @org.junit.jupiter.api.Test
    public void singleCharacterIsAlwaysAPalindrome() {
        assertTrue(Question6.isPalindrome("a"));
    }

    @org.junit.jupiter.api.Test
    public void aSingleWordPalindrome() {
        assertTrue(Question6.isPalindrome("lol"));
    }

    @org.junit.jupiter.api.Test
    public void aSingleWordNonPalindrome() {
        assertFalse(Question6.isPalindrome("omg"));
    }

    @org.junit.jupiter.api.Test
    public void multipleWordsDifferentCase() {
        assertTrue(Question6.isPalindrome("Able was I ere I saw Elba"));
    }

    @org.junit.jupiter.api.Test
    public void multipleWordsSameCase() {
        assertTrue(Question6.isPalindrome("I saw I was I"));
    }

    @org.junit.jupiter.api.Test
    public void anEmptyStringIsAlwaysAPalindrome() {
        assertTrue(Question6.isPalindrome(""));
    }

    @org.junit.jupiter.api.Test
    public void anEvenLengthPalindrome() {
        assertTrue(Question6.isPalindrome("loooool"));
    }
}