// Last updated: 7/27/2026, 2:19:32 PM
1class Solution {
2    public int longestPalindrome(String s) {
3        int[] count = new int[128];
4        for(char c : s.toCharArray()) {
5            count[c]++;
6        }
7        int length = 0;
8        boolean odd = false;
9        for(int i = 0; i < 128; i++) {
10
11            if(count[i] % 2 == 0) {
12                length += count[i];
13            }
14            else {
15                length += count[i] - 1;
16                odd = true;
17            }
18        }
19        if(odd) {
20            length++;
21        }
22        return length;
23    }
24}