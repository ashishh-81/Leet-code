class Solution {
    public boolean isPalindrome(int x) {

        if(x<0) return false;
        int num=x;
        int revnum = 0;
        while(x>0) {
            revnum = revnum*10 + x%10;
            x/=10;
        }
        

        return num== revnum;
    }
    
}