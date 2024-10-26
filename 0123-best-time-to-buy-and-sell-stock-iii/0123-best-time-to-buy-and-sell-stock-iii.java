class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = prices[0];
        int buy2 = prices[0];
        int p1=0;
        int p2=0;
        for(int i=0;i<prices.length;i++){
            buy1 = Math.min(buy1, prices[i]);
            p1 = Math.max(p1,prices[i]-buy1);
            buy2 = Math.min(buy2,prices[i]-p1);
            p2 = Math.max(p2, prices[i]-buy2);

        }
        return p2;
        
    }
}