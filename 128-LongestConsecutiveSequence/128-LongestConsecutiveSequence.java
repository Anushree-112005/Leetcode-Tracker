// Last updated: 7/9/2026, 9:15:58 AM
class Solution {
    public int longestConsecutive(int[] nums) 
    {    
        int n = nums.length;
        if (n == 0)
        return 0;
       Arrays.sort(nums);
        int l = 1; 
        int c = 1;
        for (int i = 1; i < n; i++) //i=4 4<6
        {
            if (nums[i] != nums[i - 1])//100!=200
            { 
                if (nums[i] == nums[i - 1] + 1) //200==100+1
                    c++;//c=4
                 else 
                {
                    l = Math.max(l, c);//(1,4)=4
                    c = 1;
                }
                
            }
        }
        int ans = Math.max(l, c);
        return ans;
    }
}
