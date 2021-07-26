class Solution {
    public int maxProfit(int[] prices) {
    	if(prices.length<2)
    		return 0;
    	int returnMaxProfit =0;
    	int minPrice = prices[0];
    	for(int i=1;i<prices.length;i++){
    		returnMaxProfit=(prices[i]-minPrice)>returnMaxProfit?(prices[i]-minPrice):returnMaxProfit;
    		if(prices[i]<minPrice)
    			minPrice=prices[i];
    	}
    	return returnMaxProfit;
    }
}

