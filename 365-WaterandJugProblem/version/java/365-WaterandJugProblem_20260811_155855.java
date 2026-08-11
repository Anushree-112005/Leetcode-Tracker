// Last updated: 8/11/2026, 3:58:55 PM
1class Solution {
2    public boolean canMeasureWater(int x, int y, int target) {
3
4        if (target > x + y) {
5            return false;
6        }
7
8        return target % gcd(x, y) == 0;
9    }
10
11    public int gcd(int a, int b) {
12
13        while (b != 0) {
14            int temp = b;
15            b = a % b;
16            a = temp;
17        }
18
19        return a;
20    }
21}