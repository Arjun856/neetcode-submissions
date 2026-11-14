class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if ((l < 48 || l > 57) && (l < 65 || l > 90) && (l < 97 || l > 122)) {
                left++;
                continue;
            }

            if ((r < 48 || r > 57) && (r < 65 || r > 90) && (r < 97 || r > 122)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
