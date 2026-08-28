// Last updated: 8/28/2026, 2:09:25 PM
1class Solution {
2    public int nthSuperUglyNumber(int n, int[] primes) {
3
4        int[] ugly = new int[n];
5        ugly[0] = 1;
6
7        int k = primes.length;
8        int[] index = new int[k];
9
10        for (int i = 1; i < n; i++) {
11
12            long min = Long.MAX_VALUE;
13
14            for (int j = 0; j < k; j++) {
15                long value = (long) ugly[index[j]] * primes[j];
16                min = Math.min(min, value);
17            }
18
19            ugly[i] = (int) min;
20
21            for (int j = 0; j < k; j++) {
22                long value = (long) ugly[index[j]] * primes[j];
23
24                if (value == min) {
25                    index[j]++;
26                }
27            }
28        }
29
30        return ugly[n - 1];
31    }
32}