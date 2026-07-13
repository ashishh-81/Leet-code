class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] arr= new int[nums.length];
       int [] left= new int[nums.length];
       int [] right= new int[nums.length];
        
            
            left[0]=1;
            right[nums.length-1]=1;
            // for left
            for(int j=1;j<= nums.length-1; j++){
                left[j] = left[j-1]* nums[j-1];
               
            }

            for(int k= nums.length-2; k>=0 ;k--){
                right[k] = right[k+1]* nums[k+1];
            }
            
            for(int i=0;i<nums.length;i++){
                arr[i]= left[i] * right[i];
    }

            
            return arr;
        }
        
    }