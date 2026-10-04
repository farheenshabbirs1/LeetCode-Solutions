class Solution {
    public int maxProfit(int[] prices) {
        int hold = -prices[0];
        int sold = 0;
        int res = 0;
        
        for(int i = 0 ; i < prices.length; i++){
            int prevHold = hold;
            int prevSold = sold;
            int prevRes = res;

            hold = Math.max(prevHold, prevRes - prices[i]);

sold = prevHold + prices[i];
res = Math.max(prevRes, prevSold);
        }

        return Math.max(sold, res);
    }
}