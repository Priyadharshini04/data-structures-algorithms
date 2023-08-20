package com.myjava.strivers.arrays;

import java.util.Arrays;

public class SingleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singleNumber(new int[] {4,1,2,1,2}));
		System.out.println(singleNumbers(new int[] {4,1,2,1,2}));

	}
    public static int singleNumber(int[] nums) {
    	Arrays.sort(nums);
    	System.out.println(Arrays.toString(nums));
        int num=nums[0];
        int i=0;
        while(i<nums.length)
        {
        	if((i+1)<nums.length && nums[i]==nums[i+1])
        	{
        		i=i+2;
        	}
        	else {
        		num=nums[i];
        		break;
        	}
        }
        return num;
    }
    public static int singleNumbers(int[] nums) {
        int ans=nums[0];
        int i=0;
        while(i<nums.length-1){
            ans=ans^nums[i+1];
            i++;
        }
        return ans;
    }
}
