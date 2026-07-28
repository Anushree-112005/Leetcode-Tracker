// Last updated: 7/28/2026, 2:09:55 PM
1import java.util.*;
2
3class Solution {
4    public String removeDuplicateLetters(String s) {
5
6        int[] count = new int[26];
7
8        for(char ch : s.toCharArray()) {
9            count[ch-'a']++;
10        }
11
12        Stack<Character> stack = new Stack<>();
13
14        boolean[] visited = new boolean[26];
15
16
17        for(char ch : s.toCharArray()) {
18
19            count[ch-'a']--;
20
21            if(visited[ch-'a'])
22                continue;
23
24
25            while(!stack.isEmpty() &&
26                  stack.peek() > ch &&
27                  count[stack.peek()-'a'] > 0) {
28
29                visited[stack.pop()-'a'] = false;
30            }
31
32
33            stack.push(ch);
34            visited[ch-'a'] = true;
35        }
36
37
38        StringBuilder ans = new StringBuilder();
39
40        for(char ch : stack) {
41            ans.append(ch);
42        }
43
44        return ans.toString();
45    }
46}