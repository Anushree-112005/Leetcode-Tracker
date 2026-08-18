// Last updated: 8/18/2026, 3:56:08 PM
1class Solution {
2
3    public int reversePairs(int[] nums) {
4        return mergeSort(nums, 0, nums.length - 1);
5    }
6
7    public int mergeSort(int[] nums, int left, int right) {
8
9        if (left >= right) {
10            return 0;
11        }
12
13        int mid = left + (right - left) / 2;
14
15        int count = 0;
16
17        count += mergeSort(nums, left, mid);
18
19        count += mergeSort(nums, mid + 1, right);
20
21        int j = mid + 1;
22
23        for (int i = left; i <= mid; i++) {
24
25            while (j <= right &&
26                   nums[i] > 2L * nums[j]) {
27                j++;
28            }
29
30            count += j - (mid + 1);
31        }
32
33        merge(nums, left, mid, right);
34
35        return count;
36    }
37
38    public void merge(int[] nums, int left, int mid, int right) {
39
40        int[] temp = new int[right - left + 1];
41
42        int i = left;
43        int j = mid + 1;
44        int k = 0;
45
46        while (i <= mid && j <= right) {
47
48            if (nums[i] <= nums[j]) {
49                temp[k++] = nums[i++];
50            } else {
51                temp[k++] = nums[j++];
52            }
53        }
54
55        while (i <= mid) {
56            temp[k++] = nums[i++];
57        }
58
59        while (j <= right) {
60            temp[k++] = nums[j++];
61        }
62
63        for (int x = 0; x < temp.length; x++) {
64            nums[left + x] = temp[x];
65        }
66    }
67}