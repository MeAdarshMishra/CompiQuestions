package answers.question2.code;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

class Answer2 {
    public static final int MAX_UNICODE = 65_535;

    public static void main(String[] args) {
        System.out.println(
                UniqueString.checkWhetherStringIsUnique("Competitive Programming")
        );
    }

    private static class UniqueString {
        private final String string;
        private final boolean isUniqueString;

        public UniqueString(String string) {
            this.string = string;
            this.isUniqueString = checkWhetherStringIsUnique(this.string);
        }

        public static boolean checkWhetherStringIsUnique(String string) {
            boolean response = false;
            Map<Character, Boolean> chars = new HashMap<>();
            // or use, for(char ch : str.toCharArray()) { ... }
            for (int i = 0; i < string.length(); i++) {
                if (string.codePointAt(i) <= MAX_UNICODE) {
                    char ch = string.charAt(i);
                    if (!Character.isWhitespace(ch)) {
                        Boolean put = chars.put(ch, true);
                        System.out.println(put);
                        if (put != null) {
                            return response;
                        }
                    }
                } else {
                    System.out.println("The given string contains invalid characters");
                    return response;
                }
            }
            return response;
        }

        public String getString() {
            return string;
        }

        public boolean isUniqueString() {
            return isUniqueString;
        }

        @Override
        public boolean equals(Object o) {

            if (this == o) {
                return true;
            }
            if (!(o instanceof UniqueString)) {
                return false;
            }
            UniqueString that = (UniqueString) o;
            return isUniqueString() == that.isUniqueString() && Objects.equals(getString(), that.getString());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getString(), isUniqueString());
        }

        @Override
        public String
        toString() {
            return String.format(
                    Locale.ENGLISH,
                    "'%s' " +
                            (
                                    (isUniqueString) ?
                                            "is a unique string." :
                                            "is not a unique string."
                            ),
                    this.getString()
            );
        }
    }
}
