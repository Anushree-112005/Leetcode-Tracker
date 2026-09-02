// Last updated: 9/2/2026, 9:50:09 AM
class Solution {
    public String toHex(int num) {

        if (num == 0) {
            return "0";
        }

        String digits = "0123456789abcdef";

        StringBuilder result = new StringBuilder();

        while (num != 0) {

            int value = num & 15;

            result.append(digits.charAt(value));

            num = num >>> 4;
        }

        return result.reverse().toString();
    }
}