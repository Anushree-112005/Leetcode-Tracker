// Last updated: 8/31/2026, 2:36:01 PM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3
4        int n = cost.length;
5
6        int[] dp = new int[n];
7
8        dp[0] = cost[0];
9        dp[1] = cost[1];
10
11        for (int i = 2; i < n; i++) {
12
13            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
14        }
15
16        return Math.min(dp[n - 1], dp[n - 2]);
17    }
18}