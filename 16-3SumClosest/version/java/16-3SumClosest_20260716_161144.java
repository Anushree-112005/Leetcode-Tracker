// Last updated: 7/16/2026, 4:11:44 PM
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3
4        int closest = nums[0] + nums[1] + nums[2];
5
6        for (int i = 0; i < nums.length - 2; i++) {
7
8            for (int j = i + 1; j < nums.length - 1; j++) {
9
10                for (int k = j + 1; k < nums.length; k++) {
11
12                    int sum = nums[i] + nums[j] + nums[k];
13
14                    if (Math.abs(sum - target) < Math.abs(closest - target)) {
15                        closest = sum;
16                    }
17
18                }
19            }
20        }
21
22        return closest;
23    }
24}