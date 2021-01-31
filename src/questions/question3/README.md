# Data Structures & Algorithms

## Competitive Programming Practice

### Question 3 - Counting Duplicate Characters

Problem:
Write a method that finds out the duplicate characters in a String.

**BONUS**

1. Create a separate definition class for this task.
2. Create a separate method for this task.

[]

---

Sample Starter Code

```java
import java.util.HashMap;
import java.util.Map;

class Duplicates {
    public static Map<Character, Integer> countDuplicateCharacters(String string) {
        var resultMap = new HashMap<Character, Integer>();
        // write your code here ...
        return resultMap;
    }

    public static void main(String[] args) {
        String message = "Competitive Programming Can Be A Little Bit Tricky!";
        System.out.println(countDuplicateCharacters(message));
    }
}
```