// Last updated: 8/10/2026, 3:04:38 PM
1class Solution {
2    public int integerReplacement(int n) {
3
4        long num = n;
5        int count = 0;
6
7        while(num != 1) {
8
9            if(num % 2 == 0) {
10
11                num = num / 2;
12
13            } 
14            else {
15                if(num == 3) {
16                    num--;
17                }
18                else if((num & 2) != 0) {
19                    num++;
20                }
21                else {
22                    num--;
23                }
24            }
25
26            count++;
27        }
28
29        return count;
30    }
31}