// Last updated: 7/29/2026, 2:56:46 PM
class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for(char c : s.toCharArray()) {
            count[c]++;
        }
        int length = 0;
        boolean odd = false;
        for(int i = 0; i < 128; i++) {

            if(count[i] % 2 == 0) {
                length += count[i];
            }
            else {
                length += count[i] - 1;
                odd = true;
            }
        }
        if(odd) {
            length++;
        }
        return length;
    }
}