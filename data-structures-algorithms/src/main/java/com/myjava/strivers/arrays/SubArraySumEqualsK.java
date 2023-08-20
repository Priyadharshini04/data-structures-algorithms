package com.myjava.strivers.arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SubArraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(subarraySum( new int[]{1,2,3} ,3) );
		System.out.println(subarraySum( new int[]{1,-1,0} ,0) );

	}
    public static int subarraySum(int[] nums, int k) {
        int maxCount=0;
        int start=0,end=-1;
        int sum=0;
        while(start<nums.length)
        {
        	sum=0;
        	end=start-1;
        	while(end+1<nums.length)
        	{
        		sum+=nums[end+1];
        		if(sum==k)
        		{
        			maxCount+=1;
        		}
        		end++;
        	}
        	start++;
        }
        return maxCount;
    }
}