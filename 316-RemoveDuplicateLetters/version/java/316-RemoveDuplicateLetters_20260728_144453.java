// Last updated: 7/28/2026, 2:44:53 PM
1import java.util.*;
2class Solution {
3    public String removeDuplicateLetters(String s) {
4        int[] count = new int[26];
5        for(char ch : s.toCharArray()) {
6            count[ch-'a']++;
7        }
8        Stack<Character> stack = new Stack<>();
9        boolean[] visited = new boolean[26];
10        for(char ch : s.toCharArray()) {
11            count[ch-'a']--;
12            if(visited[ch-'a'])
13                continue;
14            while(!stack.isEmpty() &&
15                  stack.peek() > ch &&
16                  count[stack.peek()-'a'] > 0) {
17                visited[stack.pop()-'a'] = false;
18            }
19            stack.push(ch);
20            visited[ch-'a'] = true;
21        }
22        StringBuilder ans = new StringBuilder();
23        for(char ch : stack) {
24            ans.append(ch);
25        }
26        return ans.toString();
27    }
28}