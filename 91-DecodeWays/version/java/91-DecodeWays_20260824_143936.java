// Last updated: 8/24/2026, 2:39:36 PM
1class Solution {
2    public int numDecodings(String s) {
3
4        int n = s.length();
5
6        int[] dp = new int[n + 1];
7
8        dp[0] = 1;
9
10        if (s.charAt(0) == '0') {
11            return 0;
12        }
13
14        dp[1] = 1;
15
16        for (int i = 2; i <= n; i++) {
17
18            char one = s.charAt(i - 1);
19
20            if (one >= '1' && one <= '9') {
21                dp[i] += dp[i - 1];
22            }
23
24            int two = Integer.parseInt(s.substring(i - 2, i));
25
26            if (two >= 10 && two <= 26) {
27                dp[i] += dp[i - 2];
28            }
29        }
30
31        return dp[n];
32    }
33}