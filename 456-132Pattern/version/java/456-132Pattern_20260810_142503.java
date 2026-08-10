// Last updated: 8/10/2026, 2:25:03 PM
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        int n = nums.length;
4        int second = Integer.MIN_VALUE;
5        Stack<Integer> stack = new Stack<>();
6        for(int i = n - 1; i >= 0; i--) {
7            if(nums[i] < second) {
8                return true;
9            }
10            while(!stack.isEmpty() && nums[i] > stack.peek()) {
11                second = stack.pop();
12            }
13            stack.push(nums[i]);
14        }
15        return false;
16    }
17}