// Last updated: 8/11/2026, 4:19:06 PM
class Solution {
    public boolean canMeasureWater(int x, int y, int target) {

        if (target > x + y) {
            return false;
        }

        return target % gcd(x, y) == 0;
    }

    public int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}