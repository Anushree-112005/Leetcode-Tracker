// Last updated: 7/22/2026, 1:46:26 PM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> ans = new ArrayList<>();
4        List<Integer> list = new ArrayList<>();
5
6        helper(1, n, k, list, ans);
7        return ans;
8    }
9    public void helper(int start, int n, int k,
10                       List<Integer> list,
11                       List<List<Integer>> ans) {
12        if (list.size() == k) {
13            ans.add(new ArrayList<>(list));
14            return;
15        }
16        for (int i = start; i <= n; i++) {
17            list.add(i);
18            helper(i + 1, n, k, list, ans);
19            list.remove(list.size() - 1);
20        }
21    }
22}
23