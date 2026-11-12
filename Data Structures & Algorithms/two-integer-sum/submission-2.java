class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(target - nums[i])) {
                firstIndex = m.get(target - nums[i]);
                secondIndex = i;
            }

            m.put(nums[i], i);
        }

        return new int[] {firstIndex, secondIndex};
    }
}
