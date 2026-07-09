// Last updated: 7/9/2026, 9:14:07 AM
class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        for(int i=1;i<nums.size();i++)
        nums[i]=nums[i-1] + nums[i];

        return nums;
    }
};