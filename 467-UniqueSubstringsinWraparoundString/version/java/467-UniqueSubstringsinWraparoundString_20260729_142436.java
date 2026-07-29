// Last updated: 7/29/2026, 2:24:36 PM
1class Solution {
2
3    public int findSubstringInWraproundString(String s) {
4
5        int[] dp = new int[26];
6
7        int len = 0;
8
9        for (int i = 0; i < s.length(); i++) {
10
11            if (i > 0 &&
12               (s.charAt(i) - s.charAt(i - 1) + 26) % 26 == 1) {
13
14                len++;
15            } else {
16
17                len = 1;
18            }
19
20            int index = s.charAt(i) - 'a';
21
22            dp[index] = Math.max(dp[index], len);
23        }
24        int ans = 0;
25        for (int x : dp)
26            ans += x;
27        return ans;
28    }
29}