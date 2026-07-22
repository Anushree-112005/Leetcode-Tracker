// Last updated: 7/22/2026, 2:24:32 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        String str = s.replace("-", "").toUpperCase();
4        StringBuilder ans = new StringBuilder();
5        int firstGroup = str.length() % k;
6        if (firstGroup > 0) {
7            ans.append(str.substring(0, firstGroup));
8        }
9        for (int i = firstGroup; i < str.length(); i += k) {
10            if (ans.length() > 0) {
11                ans.append("-");
12            }
13            ans.append(str.substring(i, i + k));
14        }
15        return ans.toString();
16    }
17}