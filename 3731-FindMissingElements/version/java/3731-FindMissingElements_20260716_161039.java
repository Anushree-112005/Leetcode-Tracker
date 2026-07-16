// Last updated: 7/16/2026, 4:10:39 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findMissingElements(int[] nums) {
5
6        List<Integer> ans = new ArrayList<>();
7        HashSet<Integer> set = new HashSet<>();
8
9        int min = nums[0];
10        int max = nums[0];
11
12        for (int num : nums) {
13            set.add(num);
14
15            if (num < min)
16                min = num;
17
18            if (num > max)
19                max = num;
20        }
21
22        for (int i = min; i <= max; i++) {
23            if (!set.contains(i)) {
24                ans.add(i);
25            }
26        }
27
28        return ans;
29    }
30}