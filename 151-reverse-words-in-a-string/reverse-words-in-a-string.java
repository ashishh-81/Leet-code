class Solution {
    public String reverseWords(String s) {
        String[] so= s.trim().split("\\s+");
        
        StringBuilder sp = new StringBuilder();

        for(int i= so.length-1 ; i >=0 ;i--) {
            sp.append(so[i]);
            if(i!=0){
                sp.append(" ");
            }
        }
        return sp.toString().trim();
    }
}