class Solution {
    /**
     * @param {number[]} prices
     * @return {number}
     */
    maxProfit(prices) {
        let profit = 0;
        let buy = prices[0];

        for(let i = 0 ; i<prices.length ; i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            profit = Math.max(profit, prices[i]-buy);
        }
        return profit;
    }
}
