package com.myjava.strivers.arrays;

public class KadaneMaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxSubArray(new int[] {-7,-8,-16,-4,-8,-5,-7,-11,-10,-12,-4,-6,-4,-16,-10 }));
	}
    public static int maxSubArray(int[] nums) {
    	int currSum=0;
    	int maxSum=0;
    	int max=Integer.MIN_VALUE;
    	for(int i=0;i<nums.length;i++) {
    		currSum=nums[i];
    		maxSum+=nums[i];
    		if(maxSum>currSum)
    		{
    			currSum=maxSum;
    		}
    		if(maxSum<0)
    		{
    			maxSum=0;
    		}
    		max=Math.max(max, currSum);
    		
    	}
		return max;

    }

}

