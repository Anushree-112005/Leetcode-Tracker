// Last updated: 8/10/2026, 3:14:27 PM
class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int second = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(int i = n - 1; i >= 0; i--) {
            if(nums[i] < second) {
                return true;
            }
            while(!stack.isEmpty() && nums[i] > stack.peek()) {
                second = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}