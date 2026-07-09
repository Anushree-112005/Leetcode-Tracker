// Last updated: 7/9/2026, 9:15:53 AM
import java.util.*;

class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;

        int ans = 0;

        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int max = 0;

            for (int j = i + 1; j < n; j++) {

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dx == 0) {
                    dy = 1;
                } else if (dy == 0) {
                    dx = 1;
                } else {
                    int g = gcd(dx, dy);
                    dx /= g;
                    dy /= g;

                    if (dx < 0) {
                        dx = -dx;
                        dy = -dy;
                    }
                }

                String slope = dx + "/" + dy;

                map.put(slope, map.getOrDefault(slope, 0) + 1);
                max = Math.max(max, map.get(slope));
            }

            ans = Math.max(ans, max + 1);
        }

        return ans;
    }

    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }
}