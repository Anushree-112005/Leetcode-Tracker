// Last updated: 9/2/2026, 9:49:24 AM
class Solution {
    public int maximumSwap(int num) {

        char[] digits = String.valueOf(num).toCharArray();

        for (int i = 0; i < digits.length; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < digits.length; j++) {

                if (digits[j] >= digits[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (digits[maxIndex] > digits[i]) {

                char temp = digits[i];
                digits[i] = digits[maxIndex];
                digits[maxIndex] = temp;

                break;
            }
        }

        return Integer.parseInt(new String(digits));
    }
}