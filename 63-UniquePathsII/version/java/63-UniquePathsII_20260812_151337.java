// Last updated: 8/12/2026, 3:13:37 PM
1class Solution {
2    public String reverseWords(String s) {
3
4        String[] words = s.split(" ");
5
6        StringBuilder result = new StringBuilder();
7
8        for (String word : words) {
9
10            StringBuilder temp = new StringBuilder(word);
11
12            result.append(temp.reverse());
13
14            result.append(" ");
15        }
16
17        return result.toString().trim();
18    }
19}