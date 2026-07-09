// Last updated: 7/9/2026, 9:13:59 AM
class Solution {
    public int numberOfCuts(int n) {
      
      if(n==1)return 0;
      if(n%2==0)return n/2;
      return n;  
    }
}
