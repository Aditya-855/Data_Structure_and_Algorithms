package Contest;
import java.util.HashMap;

public class Valid_Pair {
    public String findValidPair(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);

            if (first != second && freq.get(first) == Character.getNumericValue(first)
                    && freq.get(second) == Character.getNumericValue(second)) {
                return "" + first + second;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Valid_Pair solution = new Valid_Pair();

        String s1 = "2523533";
        System.out.println(solution.findValidPair(s1));  // Output: "23"

        String s2 = "111223";
        System.out.println(solution.findValidPair(s2));  // Output: ""

        String s3 = "334455";
        System.out.println(solution.findValidPair(s3));  // Output: "34"
    }
}

