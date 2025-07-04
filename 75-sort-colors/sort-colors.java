class Solution {
    public void sortColors(int[] nums) {
       Arrays.sort(nums); // ❌ Not allowed per problem constraints

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
        }
    }
}