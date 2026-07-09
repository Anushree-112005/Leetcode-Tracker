// Last updated: 7/9/2026, 9:14:02 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int y=num;
        int sum=0;
        int x=0;
        while(num>0)
        {
            int digit=num%10;
            sum=sum*10+digit;
            num=num/10;
        }
        while(sum>0)
        {
            int digit=sum%10;
            x=x*10+digit;
            sum=sum/10;
        }

        if(y==x)
        {
            return true;
        }
        return false;
    }
}