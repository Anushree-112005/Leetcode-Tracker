// Last updated: 8/11/2026, 4:19:14 PM
import java.util.*;

class Solution {

    public List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> result = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            for (int j = 0; j <= word.length(); j++) {

                String left = word.substring(0, j);
                String right = word.substring(j);

                if (isPalindrome(left)) {

                    String reverseRight = reverse(right);

                    if (map.containsKey(reverseRight)) {

                        int index = map.get(reverseRight);

                        if (index != i) {
                            result.add(Arrays.asList(index, i));
                        }
                    }
                }

                // Case 2: right part is palindrome
                if (j != word.length() && isPalindrome(right)) {

                    String reverseLeft = reverse(left);

                    if (map.containsKey(reverseLeft)) {

                        int index = map.get(reverseLeft);

                        if (index != i) {
                            result.add(Arrays.asList(i, index));
                        }
                    }
                }
            }
        }

        return result;
    }

    public boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public String reverse(String str) {

        return new StringBuilder(str).reverse().toString();
    }
}