// Last updated: 8/11/2026, 4:00:41 PM
1import java.util.*;
2
3class Solution {
4
5    public List<List<Integer>> palindromePairs(String[] words) {
6
7        List<List<Integer>> result = new ArrayList<>();
8
9        HashMap<String, Integer> map = new HashMap<>();
10
11        for (int i = 0; i < words.length; i++) {
12            map.put(words[i], i);
13        }
14
15        for (int i = 0; i < words.length; i++) {
16
17            String word = words[i];
18
19            for (int j = 0; j <= word.length(); j++) {
20
21                String left = word.substring(0, j);
22                String right = word.substring(j);
23
24                if (isPalindrome(left)) {
25
26                    String reverseRight = reverse(right);
27
28                    if (map.containsKey(reverseRight)) {
29
30                        int index = map.get(reverseRight);
31
32                        if (index != i) {
33                            result.add(Arrays.asList(index, i));
34                        }
35                    }
36                }
37
38                // Case 2: right part is palindrome
39                if (j != word.length() && isPalindrome(right)) {
40
41                    String reverseLeft = reverse(left);
42
43                    if (map.containsKey(reverseLeft)) {
44
45                        int index = map.get(reverseLeft);
46
47                        if (index != i) {
48                            result.add(Arrays.asList(i, index));
49                        }
50                    }
51                }
52            }
53        }
54
55        return result;
56    }
57
58    public boolean isPalindrome(String str) {
59
60        int left = 0;
61        int right = str.length() - 1;
62
63        while (left < right) {
64
65            if (str.charAt(left) != str.charAt(right)) {
66                return false;
67            }
68
69            left++;
70            right--;
71        }
72
73        return true;
74    }
75
76    public String reverse(String str) {
77
78        return new StringBuilder(str).reverse().toString();
79    }
80}