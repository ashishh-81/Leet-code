class Solution {
    public void rotate(int[] nums, int k) {
        int temp=0;
        k=k% nums.length;
        reverse (nums , 0 , nums.length-1);
        reverse (nums, 0 , k-1);
        reverse (nums , k , nums.length-1);
    }

    private void reverse(int []nums ,int first ,int end){
        int temp=0;
        while(first<end){
                temp=nums[first];
                nums[first]=nums[end];
                nums[end]=temp;
                first++;
                end--;
    
        
    }
}
}