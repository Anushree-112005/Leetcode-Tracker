// Last updated: 7/9/2026, 9:14:53 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        int ind=0; 
        Arrays.sort(s);
        Arrays.sort(g);
      
        for(int i=0;i<g.length;i++){
            for(int j=ind;j<s.length;j++){
                 ind++;
                if(g[i]<=s[j] ){
                    count++;
                   
                    break;
                }
            }
        }return count;
    }
}
