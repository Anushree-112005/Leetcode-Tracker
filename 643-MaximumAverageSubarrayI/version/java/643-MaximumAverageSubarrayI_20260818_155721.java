// Last updated: 8/18/2026, 3:57:21 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3
4        int sum = 0;
5
6        for (int i = 0; i < k; i++) {
7            sum += nums[i];
8        }
9
10        int maxSum = sum;
11
12        for (int i = k; i < nums.length; i++) {
13
14            sum = sum + nums[i] - nums[i - k];
15
16            maxSum = Math.max(maxSum, sum);
17        }
18
19        return (double) maxSum / k;
20    }
21}