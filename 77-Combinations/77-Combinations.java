// Last updated: 7/29/2026, 2:58:16 PM
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        helper(1, n, k, list, ans);
        return ans;
    }
    public void helper(int start, int n, int k,
                       List<Integer> list,
                       List<List<Integer>> ans) {
        if (list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            helper(i + 1, n, k, list, ans);
            list.remove(list.size() - 1);
        }
    }
}
