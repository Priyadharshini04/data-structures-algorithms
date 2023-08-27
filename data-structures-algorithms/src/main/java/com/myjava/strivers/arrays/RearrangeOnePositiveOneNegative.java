package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Arrays;
// https://leetcode.com/problems/rearrange-array-elements-by-sign/
public class RearrangeOnePositiveOneNegative {

    public static int[] rearrangeArray(int[] nums) {
    	int i=0;
    	int j=0;
    	ArrayList<Integer> a1=new ArrayList<Integer>();
    	ArrayList<Integer> a2=new ArrayList<Integer>();
    	for(int k=0;k<nums.length;k++)
    	{
    		if(nums[k]>=0)
    		{
    			a1.add(nums[k]);
    		}
    		else {
    			a2.add(nums[k]);
    		}
    	}
    	for(int k=0;k<nums.length;k++)
    	{
    		if(k%2==0)
    		{
        		nums[k]=a1.get(i);
        		i++;
    		}
    		else {
    			nums[k]=a2.get(j);
    			j++;
    		}
    	}
        return nums;
    }
    
    // Optimized
    public static int[] rearrangeArrayOptimized(int[] nums) {
    	int[] res=new int[nums.length];
    	int pos=0;int neg=1;
    	for(int i=0;i<nums.length;i++)
    	{
    		if(nums[i]>=0)
    		{
    			res[pos]=nums[i];
    			pos+=2;
    		}
    		else {
    			res[neg]=nums[i];
    			neg+=2;
    		}
    	}
    	return res;
    }
}
