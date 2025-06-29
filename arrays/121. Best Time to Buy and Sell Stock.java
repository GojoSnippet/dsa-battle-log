class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)return 0;
        int maxProfit = 0;int i=0,j=1;
        while(j < prices.length){
            if(prices[j] < prices[i]){i=j;j++;}
            else if(prices[j] >= prices[i]){
                maxProfit = Math.max(maxProfit,prices[j] - prices[i]);
                j++;
            }
        }
        return maxProfit;
    }
}
