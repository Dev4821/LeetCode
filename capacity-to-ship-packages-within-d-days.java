class Solution {
    private boolean canShip(int[] weights, int D, int capacity) {
        int days = 1;
        int w = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > capacity || days > D){ 
                return false;
            }
            if (w + weights[i] > capacity) {
                w = weights[i];
                days++;
            } else {
                w += weights[i];
            }
        }
        return days <= D;
    }

    public int shipWithinDays(int[] weights, int days) {
        int start = 0; 
        int end = 0;
        for (int w : weights) {
            start = Math.max(start, w);
            end += w;
        }
        int ans = 0;
        while(start <= end){
            int mid = (start + end)/2;
            boolean can = canShip(weights, days, mid);
            if(can){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
