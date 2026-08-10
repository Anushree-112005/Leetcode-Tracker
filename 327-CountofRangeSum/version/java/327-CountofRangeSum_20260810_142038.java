// Last updated: 8/10/2026, 2:20:38 PM
1class Solution {
2
3    long count = 0;
4
5    public int countRangeSum(int[] nums, int lower, int upper) {
6
7        long[] prefix = new long[nums.length + 1];
8
9        for(int i=0;i<nums.length;i++){
10            prefix[i+1] = prefix[i] + nums[i];
11        }
12
13        mergeSort(prefix,0,prefix.length-1,lower,upper);
14
15        return (int)count;
16    }
17
18
19    void mergeSort(long[] arr, int left, int right, int lower, int upper){
20
21        if(left >= right)
22            return;
23
24
25        int mid = left + (right-left)/2;
26
27
28        mergeSort(arr,left,mid,lower,upper);
29
30        mergeSort(arr,mid+1,right,lower,upper);
31
32
33
34        int low = mid+1;
35        int high = mid+1;
36
37
38        for(int i=left;i<=mid;i++){
39
40            while(low<=right && arr[low]-arr[i] < lower)
41                low++;
42
43
44            while(high<=right && arr[high]-arr[i] <= upper)
45                high++;
46
47
48            count += high-low;
49        }
50
51
52        merge(arr,left,mid,right);
53    }
54
55
56
57    void merge(long[] arr,int left,int mid,int right){
58
59        long[] temp = new long[right-left+1];
60
61        int i=left;
62        int j=mid+1;
63        int k=0;
64
65
66        while(i<=mid && j<=right){
67
68            if(arr[i]<=arr[j])
69                temp[k++]=arr[i++];
70            else
71                temp[k++]=arr[j++];
72        }
73
74
75        while(i<=mid)
76            temp[k++]=arr[i++];
77
78
79        while(j<=right)
80            temp[k++]=arr[j++];
81
82
83        for(int x=0;x<temp.length;x++)
84            arr[left+x]=temp[x];
85    }
86}