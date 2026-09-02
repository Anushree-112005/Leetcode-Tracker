// Last updated: 9/2/2026, 9:50:24 AM
class Solution {
    public int getSum(int a, int b) {

        while (b != 0) {

            int carry = (a & b) << 1;

            a = a ^ b;
            b = carry;
        }

        return a;
    }
}