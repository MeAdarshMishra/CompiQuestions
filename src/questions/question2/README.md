# Data Structures & Algorithms

## Competitive Programming Practice

### Question 2 - Unique Characters

Problem:
Consider a String that can contain ASCII and Unicode characters ranging between 0-65,535. Write a program that
returns `true` if

* the String contains unique characters (i.e no character in the String is repeated).
* whitespaces in the String can be ignored.1

**BONUS**

1. Create a separate definition class for this task.
2. Create a separate method for this task.

[Google, Adobe, Microsoft]

---

Sample Starter Code

```java
import java.util.HashMap;
import java.util.Map;

class Question2 {
    public static final int MAX_UNICODE = 65_535;

    public static void main(String[] args) {
        System.out.println(checkWhetherStringIsUnique("Competitive Programming"));
    }

    public static boolean checkWhetherStringIsUnique(String string) {
        Map<Character, Boolean> characters = new HashMap<>();

        // Write your code here...

        return true;
    }
}
```