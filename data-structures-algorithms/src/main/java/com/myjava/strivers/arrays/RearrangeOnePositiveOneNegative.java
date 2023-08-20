package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeOnePositiveOneNegative {

	public static void main(String[] args) {
		int[] arr=rearrangeArray(new int[] {3,1,-2,-5,2,-4});
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(arr));
	}
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
}
