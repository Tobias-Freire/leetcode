class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int difference;
        for (int i = 0; i < nums.length; i++) {
            difference = target - nums[i];
            if (map.get(difference) != null) {
                return new int[] {i, map.get(difference)};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}