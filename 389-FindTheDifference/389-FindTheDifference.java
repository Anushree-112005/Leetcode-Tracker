// Last updated: 7/9/2026, 9:15:02 AM
class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;

        for (char c : s.toCharArray()) {
            ans ^= c;
        }

        for (char c : t.toCharArray()) {
            ans ^= c;
        }

        return ans;
    }
}