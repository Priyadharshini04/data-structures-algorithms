package com.myjava.strivers.arrays;

//https://leetcode.com/problems/max-consecutive-ones

public class ConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
    	int count=0;
    	int maxCount=count;
    	for(int i=0;i<nums.length;i++)
    	{
    		if(nums[i]==1)
    		{
    			count+=1;
    		}
    		else {
    			if(maxCount<count)
    			{
    				maxCount=count;
    			}
				count=0;
    		}
    	}
    	if(maxCount<count)
		{
			maxCount=count;
		}
        return maxCount;
    }

}