// Last updated: 8/12/2026, 4:11:36 PM
1class Solution {
2    public int[] sortArray(int[] nums) {
3        mergeSort(nums, 0, nums.length - 1);
4        return nums;
5    }
6
7    public void mergeSort(int[] nums, int left, int right) {
8
9        if (left >= right) {
10            return;
11        }
12
13        int mid = left + (right - left) / 2;
14
15        mergeSort(nums, left, mid);
16        mergeSort(nums, mid + 1, right);
17
18        merge(nums, left, mid, right);
19    }
20
21    public void merge(int[] nums, int left, int mid, int right) {
22
23        int[] temp = new int[right - left + 1];
24
25        int i = left;
26        int j = mid + 1;
27        int k = 0;
28
29        while (i <= mid && j <= right) {
30
31            if (nums[i] <= nums[j]) {
32                temp[k] = nums[i];
33                i++;
34            } else {
35                temp[k] = nums[j];
36                j++;
37            }
38
39            k++;
40        }
41
42        while (i <= mid) {
43            temp[k] = nums[i];
44            i++;
45            k++;
46        }
47
48        while (j <= right) {
49            temp[k] = nums[j];
50            j++;
51            k++;
52        }
53
54        for (int x = 0; x < temp.length; x++) {
55            nums[left + x] = temp[x];
56        }
57    }
58}