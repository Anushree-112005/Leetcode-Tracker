// Last updated: 9/3/2026, 1:58:25 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findAnagrams(String s, String p) {
5
6        List<Integer> result = new ArrayList<>();
7
8        if (s.length() < p.length()) {
9            return result;
10        }
11
12        int[] pCount = new int[26];
13        int[] window = new int[26];
14
15        for (int i = 0; i < p.length(); i++) {
16            pCount[p.charAt(i) - 'a']++;
17            window[s.charAt(i) - 'a']++;
18        }
19
20        if (Arrays.equals(pCount, window)) {
21            result.add(0);
22        }
23
24        for (int i = p.length(); i < s.length(); i++) {
25
26            window[s.charAt(i) - 'a']++;
27
28            window[s.charAt(i - p.length()) - 'a']--;
29
30            if (Arrays.equals(pCount, window)) {
31                result.add(i - p.length() + 1);
32            }
33        }
34
35        return result;
36    }
37}