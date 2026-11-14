class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        Set<List<Integer>> duplicates = new HashSet<>();
        
        for (int i = 1; i < nums.length - 1; i++) {
            int left = 0;
            int right = nums.length - 1;

            while (left < i  && right > i) {
                int total = nums[left] + nums[right] + nums[i];

                if (total == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);

                    if (!duplicates.contains(triplet)) {
                        triplets.add(triplet);
                        duplicates.add(triplet);
                    }

                    left++;
                    right--;

                } else if (total > 0) {
                    right--;
                } else if (total < 0) {
                    left++;
                }
            }
        }

        return triplets;
    }
}
