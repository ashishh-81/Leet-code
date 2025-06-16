class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int len=nums.length;
        int g=len-k;
        return nums[g];
    }
}