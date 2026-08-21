// Last updated: 8/21/2026, 6:21:59 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> fourSum(int[] nums, int target) {
5
6        List<List<Integer>> ans = new ArrayList<>();
7
8        Arrays.sort(nums);
9
10        int n = nums.length;
11
12        for (int i = 0; i < n - 3; i++) {
13
14            // Skip duplicate i
15            if (i > 0 && nums[i] == nums[i - 1])
16                continue;
17
18            for (int j = i + 1; j < n - 2; j++) {
19
20                // Skip duplicate j
21                if (j > i + 1 && nums[j] == nums[j - 1])
22                    continue;
23
24                int left = j + 1;
25                int right = n - 1;
26
27                while (left < right) {
28
29                    long sum = (long) nums[i] + nums[j]
30                             + nums[left] + nums[right];
31
32                    if (sum == target) {
33
34                        ans.add(Arrays.asList(
35                            nums[i], nums[j],
36                            nums[left], nums[right]
37                        ));
38
39                        // Skip duplicate left
40                        while (left < right &&
41                               nums[left] == nums[left + 1])
42                            left++;
43
44                        // Skip duplicate right
45                        while (left < right &&
46                               nums[right] == nums[right - 1])
47                            right--;
48
49                        left++;
50                        right--;
51
52                    }
53                    else if (sum < target) {
54                        left++;
55                    }
56                    else {
57                        right--;
58                    }
59                }
60            }
61        }
62
63        return ans;
64    }
65}