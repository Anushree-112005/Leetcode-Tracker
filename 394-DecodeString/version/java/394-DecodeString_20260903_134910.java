// Last updated: 9/3/2026, 1:49:10 PM
1import java.util.*;
2
3class Solution {
4    public String decodeString(String s) {
5        Stack<Integer> countStack = new Stack<>();
6        Stack<String> stringStack = new Stack<>();
7
8        String current = "";
9        int num = 0;
10
11        for (char ch : s.toCharArray()) {
12
13            if (Character.isDigit(ch)) {
14                num = num * 10 + (ch - '0');
15            }
16
17            else if (ch == '[') {
18                countStack.push(num);
19                stringStack.push(current);
20
21                num = 0;
22                current = "";
23            }
24
25            else if (ch == ']') {
26                int count = countStack.pop();
27                String previous = stringStack.pop();
28
29                String temp = "";
30
31                for (int i = 0; i < count; i++) {
32                    temp += current;
33                }
34
35                current = previous + temp;
36            }
37
38            else {
39                current += ch;
40            }
41        }
42
43        return current;
44    }
45}