// Last updated: 8/28/2026, 2:10:45 PM
1class Solution {
2    public int maximumSwap(int num) {
3
4        char[] digits = String.valueOf(num).toCharArray();
5
6        for (int i = 0; i < digits.length; i++) {
7
8            int maxIndex = i;
9
10            for (int j = i + 1; j < digits.length; j++) {
11
12                if (digits[j] >= digits[maxIndex]) {
13                    maxIndex = j;
14                }
15            }
16
17            if (digits[maxIndex] > digits[i]) {
18
19                char temp = digits[i];
20                digits[i] = digits[maxIndex];
21                digits[maxIndex] = temp;
22
23                break;
24            }
25        }
26
27        return Integer.parseInt(new String(digits));
28    }
29}