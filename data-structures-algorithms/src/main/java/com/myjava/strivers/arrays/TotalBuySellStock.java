package com.myjava.strivers.arrays;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class TotalBuySellStock {

	public static int maxProfit(int[] prices) {
    	int min=0;
    	int max=0;
    	int sum=0;
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
    				max=i;
        			sum+=prices[max]-prices[min];
        			min=i;
    		}
    		
    	}
		return sum;
    }
}
