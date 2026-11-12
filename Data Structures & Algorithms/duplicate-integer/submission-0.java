class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                m.put(nums[i], m.get(nums[i]) + 1);
            } else {
                m.put(nums[i], 1);
            }
        }

        boolean r = false;
        for (int num : m.keySet()) {
            if (m.get(num) > 1) {
                r = true;
                break;
            }
        }

        return r;
    }
}