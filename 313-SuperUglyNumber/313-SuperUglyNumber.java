// Last updated: 9/2/2026, 9:51:13 AM
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {

        int[] ugly = new int[n];
        ugly[0] = 1;

        int k = primes.length;
        int[] index = new int[k];

        for (int i = 1; i < n; i++) {

            long min = Long.MAX_VALUE;

            for (int j = 0; j < k; j++) {
                long value = (long) ugly[index[j]] * primes[j];
                min = Math.min(min, value);
            }

            ugly[i] = (int) min;

            for (int j = 0; j < k; j++) {
                long value = (long) ugly[index[j]] * primes[j];

                if (value == min) {
                    index[j]++;
                }
            }
        }

        return ugly[n - 1];
    }
}