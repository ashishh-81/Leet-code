import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums); // Sort first

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i; // Found mismatch, that's the missing number
            }
        }

        return nums.length; // If all matched, missing number is n
    }
}
