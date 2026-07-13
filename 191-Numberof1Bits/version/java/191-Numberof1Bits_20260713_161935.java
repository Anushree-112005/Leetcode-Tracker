// Last updated: 7/13/2026, 4:19:35 PM
1class Solution {
2    public int hammingWeight(int n) {
3        int count = 0;
4
5        while (n != 0) {
6            if ((n & 1) == 1) {
7                count++;
8            }
9            n = n >>> 1;
10        }
11
12        return count;
13    }
14}