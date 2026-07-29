// Last updated: 7/29/2026, 2:56:29 PM
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, 0, 0, target);
    }
    public int helper(int[] nums, int index, int sum, int target) {
        if (index == nums.length) {
            if (sum == target)
                return 1;
            else
                return 0;
        }
        int add = helper(nums, index + 1, sum + nums[index], target);
        int subtract = helper(nums, index + 1, sum - nums[index], target);
        return add + subtract;
    }
}