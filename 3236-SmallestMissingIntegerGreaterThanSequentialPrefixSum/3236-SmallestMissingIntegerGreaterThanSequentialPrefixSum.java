// Last updated: 7/9/2026, 9:13:56 AM
class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length == 1) {
            return nums[0]+1;
        }
        int lsps = 0;
        int j = 0, newidx = 0;
        for(j = 1; j < nums.length; j++) {
            if(nums[j] == nums[j-1]+1) {
                lsps += nums[j-1];
            }
            else {
                lsps += nums[j-1];
                break;
            }
        }
        if(j >= nums.length && nums[j-1] == nums[j-2]+1) {
            lsps += nums[j-1];
        }
        Arrays.sort(nums);
        while(newidx < nums.length) {
            if(nums[newidx] != lsps) {
                newidx++;
            }
            else {
                lsps += 1;
                newidx++;
            }
        }
        return lsps;
    }
}