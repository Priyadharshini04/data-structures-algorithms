package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
	}
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