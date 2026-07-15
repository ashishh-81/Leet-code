class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int totalgas=0;
        int totalcost=0;
        for(int i=0;i< gas.length;i++){
            totalgas+= gas[i];
            totalcost += cost[i];
        }
        if(totalgas< totalcost){
            return -1;
        }

        int start =0;
        int current =0;
        for(int i=0;i<gas.length-1;i++){
            current = current + gas[i] - cost[i] ;
            if (current < 0){
                start = i+1;
                current =0;
            }
        }
        return start;
    }
}