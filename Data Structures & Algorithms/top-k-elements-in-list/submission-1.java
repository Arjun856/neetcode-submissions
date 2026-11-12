class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                m.put(nums[i], m.get(nums[i]) + 1);
            } else {
                m.put(nums[i], 1);
            }
        }

        List<Integer> l = new ArrayList<Integer>(m.keySet());
        l.sort((a,b) -> m.get(b) - m.get(a));

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = l.get(i);
        }

        return result;


        
    }
}
