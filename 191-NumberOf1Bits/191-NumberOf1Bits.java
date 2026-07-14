// Last updated: 7/14/2026, 10:04:15 AM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }

        return count;
    }
}