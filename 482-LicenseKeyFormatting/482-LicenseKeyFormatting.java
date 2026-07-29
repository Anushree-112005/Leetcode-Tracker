// Last updated: 7/29/2026, 2:56:32 PM
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String str = s.replace("-", "").toUpperCase();
        StringBuilder ans = new StringBuilder();
        int firstGroup = str.length() % k;
        if (firstGroup > 0) {
            ans.append(str.substring(0, firstGroup));
        }
        for (int i = firstGroup; i < str.length(); i += k) {
            if (ans.length() > 0) {
                ans.append("-");
            }
            ans.append(str.substring(i, i + k));
        }
        return ans.toString();
    }
}