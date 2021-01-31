package answers.question1.code;

import java.util.*;

class Answer1 {
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
        var pairsList = new ArrayList<String>();
        // Arrays.sort() has complexity of O(n log n) Cool!!!
        Arrays.sort(numbers);
        var leftPointer = 0;
        var rightPointer = numbers.length - 1;
        while (leftPointer < rightPointer) {
            var firstNumber = numbers[leftPointer];
            var secondNumber = numbers[rightPointer];
            var currentSum = firstNumber + secondNumber;
            if (currentSum == desiredSum) {
                var pair = new Pair<>(firstNumber, secondNumber);
                pairsList.add(pair.toString());
                leftPointer++;
                rightPointer--;
            } else if (currentSum < desiredSum) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return pairsList;
    }

    // Bonus : Separate Definition Class for a "Pair"
    private static class Pair<N extends Number, M extends Number> {
        private N firstNumber;
        private M secondNumber;

        public Pair(N firstNumber, M secondNumber) {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        }

        public N getFirstNumber() {
            return firstNumber;
        }

        public void setFirstNumber(N firstNumber) {
            this.firstNumber = firstNumber;
        }

        public M getSecondNumber() {
            return secondNumber;
        }

        public void setSecondNumber(M secondNumber) {
            this.secondNumber = secondNumber;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Pair)) {
                return false;
            }
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(getFirstNumber(), pair.getFirstNumber()) &&
                    Objects.equals(getSecondNumber(), pair.getSecondNumber());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getFirstNumber(), getSecondNumber());
        }

        @Override
        public String toString() {
            return String.format(
                    "(%s, %s)", this.getFirstNumber(), this.getSecondNumber()
            );
        }
    }
}