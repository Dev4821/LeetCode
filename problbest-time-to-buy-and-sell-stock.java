class Solution {
    public int maxProfit(int[] prices) {
      int minPrice = Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minPrice)
                minPrice=prices[i];
            max=Math.max(prices[i]-minPrice,max);
        }
        
        return max;
    }
}
