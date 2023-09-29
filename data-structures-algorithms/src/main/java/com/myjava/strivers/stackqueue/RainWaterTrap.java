package com.myjava.strivers.stackqueue;
// https://leetcode.com/problems/trapping-rain-water/description/
public class RainWaterTrap {

	public static int trap(int[] height) {
		int count=0;
		int left=0;
		int right=height.length-1;
		int leftMax=0;
		int rightMax=0;
		while(left<=right)
		{
			if(height[left]<=height[right])
			{
				if(height[left]<leftMax)
				{
					count+=leftMax-height[left];
				}
				else {
					leftMax=height[left];
				}
				left++;
			}
			else {
				if(height[right]<rightMax)
				{
					count+=rightMax-height[right];
				}
				else {
					rightMax=height[right];
				}
				right--;
			}
		}
		return count;
	}

}
