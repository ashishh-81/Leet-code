class Solution {
    public long minimumDifference(int[] nums) {
        int n = nums.length;
        int a = n / 3;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long rightsum = 0;
        long[] maxRightSum = new long[n];
        for(int i = n - 1; i >= a; i--) {
            minHeap.add(nums[i]);
            rightsum += nums[i];
            if(minHeap.size() > a) rightsum -= minHeap.poll();
            if(minHeap.size() == a) maxRightSum[i] = rightsum;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((m,l) -> l - m);
        long leftsum = 0, minDiff = Long.MAX_VALUE;
        long[] minLeftSum = new long[n];
        for(int i = 0; i < 2 * a ; i++) {
            maxHeap.add(nums[i]);
            leftsum += nums[i];
            if(maxHeap.size() > a) leftsum -= maxHeap.poll();
            if(maxHeap.size() == a && i + 1 < n) {
                minLeftSum[i] = leftsum;
                minDiff = Math.min(minDiff, minLeftSum[i] - maxRightSum[i + 1]);
            }
        }
        return minDiff;
    }
}