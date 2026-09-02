// Last updated: 9/2/2026, 9:50:12 AM
import java.util.*;

class Solution {

    int[] nums;
    Random random = new Random();

    Solution(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {

        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indexes.add(i);
            }
        }

        int randomIndex = random.nextInt(indexes.size());

        return indexes.get(randomIndex);
    }
}