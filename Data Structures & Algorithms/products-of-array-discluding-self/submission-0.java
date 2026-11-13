class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                total *= nums[i];
            }
        }

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                arr[i] = 0;
            } else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    arr[i] = total;
                } else {
                    arr[i] = 0;
                }
            } else {
                arr[i] = total / nums[i];
            }
        }

        return arr;
    }
}