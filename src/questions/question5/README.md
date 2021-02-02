# Data Structures & Algorithms

## Competitive Programming Practice

### Question 5 - Reversing Letters & Words

**Problem**:  
Write a program that -

1. reverses all the letters in a word.
2. reverses all the letters in a word, and all the words in a sentence.

**BONUS**

1. Create a separate definition class for this task.
2. Create a separate method for this task.

[]

---

Starter Code

```java
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
```