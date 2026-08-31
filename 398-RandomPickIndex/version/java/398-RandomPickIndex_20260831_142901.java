// Last updated: 8/31/2026, 2:29:01 PM
1import java.util.*;
2
3class Solution {
4
5    int[] nums;
6    Random random = new Random();
7
8    Solution(int[] nums) {
9        this.nums = nums;
10    }
11
12    public int pick(int target) {
13
14        ArrayList<Integer> indexes = new ArrayList<>();
15
16        for (int i = 0; i < nums.length; i++) {
17            if (nums[i] == target) {
18                indexes.add(i);
19            }
20        }
21
22        int randomIndex = random.nextInt(indexes.size());
23
24        return indexes.get(randomIndex);
25    }
26}