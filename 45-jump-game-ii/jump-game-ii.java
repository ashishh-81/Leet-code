class Solution {
    public int jump(int[] nums) {
        int end=0;
        int count=0;
        int sabsedur=0;

        for(int i=0;i<nums.length-1;i++){
            
            sabsedur=Math.max(sabsedur,nums[i]+i );
            
            if (sabsedur >= nums.length-1){
            count++;
            return count;
            }

            if(i == end){
                count++;
                end = sabsedur;
            }
        }
        return count;
            
    }
}