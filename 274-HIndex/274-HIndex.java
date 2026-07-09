// Last updated: 7/9/2026, 9:15:22 AM
import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;
        for (int i = 0; i < n; i++) {
            int papersWithAtLeastThisCitation = n - i;
            if (citations[i] >= papersWithAtLeastThisCitation) {
                h = papersWithAtLeastThisCitation;
                break;
            }
        }
        return h;
    }
}