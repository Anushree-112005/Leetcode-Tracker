// Last updated: 7/9/2026, 9:14:55 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> a = new HashSet<>();

        for(int i:nums){
            a.add(i);
        }

        List<Integer> arr = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!a.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}