// Last updated: 9/2/2026, 9:50:51 AM
class Solution {
    public int[] countBits(int n) {

        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i / 2] + i % 2;
        }

        return ans;
    }
}