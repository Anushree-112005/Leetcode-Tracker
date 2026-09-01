// Last updated: 9/1/2026, 2:21:47 PM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3
4        if (s1.length() + s2.length() != s3.length()) {
5            return false;
6        }
7
8        int m = s1.length();
9        int n = s2.length();
10
11        boolean[][] dp = new boolean[m + 1][n + 1];
12
13        dp[0][0] = true;
14
15        for (int i = 0; i <= m; i++) {
16            for (int j = 0; j <= n; j++) {
17
18                if (i == 0 && j == 0) {
19                    continue;
20                }
21
22                int k = i + j - 1;
23
24                if (i > 0 &&
25                    dp[i - 1][j] &&
26                    s1.charAt(i - 1) == s3.charAt(k)) {
27
28                    dp[i][j] = true;
29                }
30
31                if (j > 0 &&
32                    dp[i][j - 1] &&
33                    s2.charAt(j - 1) == s3.charAt(k)) {
34
35                    dp[i][j] = true;
36                }
37            }
38        }
39
40        return dp[m][n];
41    }
42}