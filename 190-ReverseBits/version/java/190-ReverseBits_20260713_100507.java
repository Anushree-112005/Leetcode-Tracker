// Last updated: 7/13/2026, 10:05:07 AM
1public class Solution {
2    public int reverseBits(int n) {
3
4        int result = 0;
5        for (int i = 0; i < 32; i++) {
6            result = result << 1;     
7            result = result | (n & 1); 
8            n = n >> 1;                
9        }
10        return result;
11    }
12}