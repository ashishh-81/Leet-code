class Solution {
    public boolean canJump(int[] nums) {
        int sabsedur=0;
        for(int i=0;i<nums.length;i++){
            if(i>sabsedur){
                return false;
            }
            sabsedur=Math.max(sabsedur, i+nums[i]);
            if(sabsedur==nums.length-1){
                return true;
            }

        }
        return true;
            
    }
}