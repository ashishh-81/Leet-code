class Solution {
    public void nextPermutation(int[] nums) {
        int idx1 = -1;
        int idx2 = -1;
        int n = nums.length;

        //Step 1 - Find Breaking point 
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                idx1 = i;
                break;
            }
        }

        //if there is no breaking point
        if(idx1 == -1) {
            reverse(nums, 0);
        } else {

            //Step 2 - Find next greater element & swap with idx1
            for(int i = n - 1; i >= 0; i--) {
                if(nums[i] > nums[idx1]) {
                    idx2 = i;
                    break;
                }
            }

            swap(nums, idx1, idx2);

            //Step 3 - Reverse the rest right half
            reverse(nums, idx1 + 1);
        }
    }

    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while(i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

}