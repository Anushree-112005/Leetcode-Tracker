// Last updated: 8/12/2026, 4:13:04 PM
1import java.util.HashMap;
2
3class Solution {
4    public boolean containsNearbyDuplicate(int[] nums, int k) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        for (int i = 0; i < nums.length; i++) {
9
10            if (map.containsKey(nums[i])) {
11
12                int previousIndex = map.get(nums[i]);
13
14                if (i - previousIndex <= k) {
15                    return true;
16                }
17            }
18
19            map.put(nums[i], i);
20        }
21
22        return false;
23    }
24}