// Last updated: 7/29/2026, 2:56:34 PM
class Solution {

    public int findSubstringInWraproundString(String s) {

        int[] dp = new int[26];

        int len = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i > 0 &&
               (s.charAt(i) - s.charAt(i - 1) + 26) % 26 == 1) {

                len++;
            } else {

                len = 1;
            }

            int index = s.charAt(i) - 'a';

            dp[index] = Math.max(dp[index], len);
        }
        int ans = 0;
        for (int x : dp)
            ans += x;
        return ans;
    }
}