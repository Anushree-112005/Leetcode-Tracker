// Last updated: 9/1/2026, 2:25:09 PM
1class Solution {
2    public int getSum(int a, int b) {
3
4        while (b != 0) {
5
6            int carry = (a & b) << 1;
7
8            a = a ^ b;
9            b = carry;
10        }
11
12        return a;
13    }
14}