// Last updated: 7/9/2026, 9:14:43 AM
class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set =new HashSet<>();
        int[] ans = new int[2];
        int n=nums.length;
        for(int num:nums){
            if(!set.add(num)){
                ans[0]=num;
            }
        }
        int setSum=0;
        for(Integer num:set){
            setSum+=num;
        }
        int sum=n*(n+1)/2;
        ans[1]=sum-setSum;
        return ans;
    }
}