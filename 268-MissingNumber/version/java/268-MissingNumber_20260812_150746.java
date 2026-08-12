// Last updated: 8/12/2026, 3:07:46 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3
4        int n = nums.length;
5
6        int expectedSum = n * (n + 1) / 2;
7
8        int actualSum = 0;
9
10        for (int num : nums) {
11            actualSum += num;
12        }
13
14        return expectedSum - actualSum;
15    }
16}