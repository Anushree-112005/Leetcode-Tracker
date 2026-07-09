// Last updated: 7/9/2026, 9:15:37 AM
class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;

        for (int num : nums) {
            int curr = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}