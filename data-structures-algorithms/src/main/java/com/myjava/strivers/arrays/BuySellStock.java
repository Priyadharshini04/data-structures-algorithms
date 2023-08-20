package com.myjava.strivers.arrays;

public class BuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProfit(new int[] {7,4,6,3,1}));
	}
    public static int maxProfit(int[] prices) {
    	int min=0;
    	int max=0;
    	int maxProfit=0;
    	if(prices.length==1)
    		return 0;
    	if(prices.length==2)
    	{
    		if(prices[0]<prices[1])
    		{
    			return prices[1]-prices[0];
    		}
    		else {
    			return 0;
    		}
    	}
    	for(int i=1;i<prices.length;i++) {
    		if(prices[i]<prices[min])
    		{
    			min=i;
    			max=i+1;
    		}
    		if(max<prices.length && i>min)
    		{
    			if( prices[max]<prices[i] )
    			{
    				max=i;
    			}
    			maxProfit=Math.max(maxProfit, prices[max]-prices[min]);
    		}
    		
    	}
		return maxProfit;
    }
}
