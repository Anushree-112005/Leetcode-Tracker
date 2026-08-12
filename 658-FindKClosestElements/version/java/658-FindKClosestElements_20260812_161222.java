// Last updated: 8/12/2026, 4:12:22 PM
1class Solution {
2    public List<Integer> findClosestElements(int[] arr, int k, int x) {
3
4        int left = 0;
5        int right = arr.length - 1;
6
7        while (right - left + 1 > k) {
8
9            if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
10                right--;
11            } else {
12                left++;
13            }
14        }
15
16        List<Integer> result = new ArrayList<>();
17
18        for (int i = left; i <= right; i++) {
19            result.add(arr[i]);
20        }
21
22        return result;
23    }
24}