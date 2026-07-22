// Last updated: 7/22/2026, 1:59:24 PM
1class Solution {
2    public int findTargetSumWays(int[] nums, int target) {
3        return helper(nums, 0, 0, target);
4    }
5    public int helper(int[] nums, int index, int sum, int target) {
6        if (index == nums.length) {
7            if (sum == target)
8                return 1;
9            else
10                return 0;
11        }
12        int add = helper(nums, index + 1, sum + nums[index], target);
13        int subtract = helper(nums, index + 1, sum - nums[index], target);
14        return add + subtract;
15    }
16}