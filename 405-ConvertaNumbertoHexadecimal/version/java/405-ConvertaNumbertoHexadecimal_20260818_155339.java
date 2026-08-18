// Last updated: 8/18/2026, 3:53:39 PM
1class Solution {
2    public String toHex(int num) {
3
4        if (num == 0) {
5            return "0";
6        }
7
8        String digits = "0123456789abcdef";
9
10        StringBuilder result = new StringBuilder();
11
12        while (num != 0) {
13
14            int value = num & 15;
15
16            result.append(digits.charAt(value));
17
18            num = num >>> 4;
19        }
20
21        return result.reverse().toString();
22    }
23}