// Last updated: 8/21/2026, 6:22:59 PM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> combinationSum(int[] candidates, int target) {
5
6        List<List<Integer>> result = new ArrayList<>();
7
8        solve(candidates, target, 0, new ArrayList<>(), result);
9
10        return result;
11    }
12
13    static void solve(int[] arr, int target, int start,
14                      List<Integer> temp,
15                      List<List<Integer>> result) {
16
17        if (target == 0) {
18            result.add(new ArrayList<>(temp));
19            return;
20        }
21
22        if (target < 0) {
23            return;
24        }
25
26        for (int i = start; i < arr.length; i++) {
27
28            temp.add(arr[i]);
29
30            solve(arr, target - arr[i], i, temp, result);
31
32            temp.remove(temp.size() - 1);
33        }
34    }
35}