// Last updated: 7/9/2026, 9:14:51 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int n:nums){

            if(n==0){
                count =0;
            } else {
                count++;
            }
            if(max<count){
                max=count;
            }
        }
        return max;
    }
}