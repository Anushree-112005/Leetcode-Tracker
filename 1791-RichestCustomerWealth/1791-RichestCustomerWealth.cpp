// Last updated: 7/9/2026, 9:14:06 AM
class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int maxWealth = 0;
        for(int i=0;i<accounts.size();i++)
        {
        int sum=0;
        for(int j=0;j<accounts[i].size();j++)
        {
            sum+=accounts[i][j];
        }

        maxWealth=max(maxWealth,sum);
        }
        return  maxWealth;
    }
        
};