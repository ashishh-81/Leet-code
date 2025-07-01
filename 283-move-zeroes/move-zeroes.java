class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        // Fill remaining array with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
