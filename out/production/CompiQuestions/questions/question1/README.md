# Data Structures & Algorithms

## Competitive Programming Practice

### Question 1 - Pairs

Problem:
Consider an array of integers that may contain both positive and negative integers, called `numbers`. Write a program
that finds all the pairs of integers whose sum is equal to a given value called `desiredSum`.

**BONUS**

1. Create a separate definition class for this task.
2. Create a separate method for this task.

[Amazon, Adobe, Flipkart]

---

Sample Starter Code

```java
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Question1 {
    // Please try not to change anything in this method.
    public static void main(String[] args) {
        int[] numbers = new int[15];
        addRandomNumbers(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(findPairs(numbers, 10));
    }

    // Please try not to change anything in this method.
    public static void addRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt() % 10;
        }
    }

    // Try to complete this method.
    public static List<String> findPairs(int[] numbers, int desiredSum) {
        return null;
    }
}
```