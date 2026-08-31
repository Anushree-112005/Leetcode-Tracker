// Last updated: 8/31/2026, 2:31:02 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3
4        int n = nums.length;
5        int[] dp = new int[n];
6
7        for (int i = 0; i < n; i++) {
8            dp[i] = 1;
9        }
10
11        int ans = 1;
12
13        for (int i = 0; i < n; i++) {
14
15            for (int j = 0; j < i; j++) {
16
17                if (nums[j] < nums[i]) {
18                    dp[i] = Math.max(dp[i], dp[j] + 1);
19                }
20            }
21
22            ans = Math.max(ans, dp[i]);
23        }
24
25        return ans;
26    }
27}