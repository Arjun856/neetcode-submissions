class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstIndex = 0;
        int secondIndex = 0;

        int left = 0;
        int right = numbers.length - 1;
        int total = numbers[left] + numbers[right];

        while (left < right) {
            total = numbers[left] + numbers[right];
            if (total == target) {
                firstIndex = left;
                secondIndex = right;
                break;
            } else if (total > target) {
                right--;
            } else if (total < target) {
                left++;
            }
        }

        return new int[] {firstIndex + 1, secondIndex + 1};  
    }
}
