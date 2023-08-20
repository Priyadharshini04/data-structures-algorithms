package com.myjava.strivers.arrays;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingNumber(new int[] {40,43,42,18,6,13,19,8,44,4,12,22,31,30,10,16,3,17,25,7,41,21,48,26,32,27,49,15,1,20,35,46,11,23,2,0,38,28,37,9,39,47,36,45,24,34,29,14,33}));
	}
    public static int missingNumber(int[] nums) {
    	//String str=Arrays.toString(nums);
    	Arrays.sort(nums);
        int i=0;
        while(i<nums.length)
        {
        	if(nums[i]!=i)
        	{
        		return i;
        	}
            i++;
        }
        return i;
    }
}
