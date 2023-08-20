package com.myjava.strivers.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1,3,2};
		nextPermutation(nums );
		System.out.println(Arrays.toString(nums));
	}
    public static void nextPermutation(int[] nums) {
    	int breakPoint=-1;
    	for(int i=nums.length-2;i>=0;i--)
    	{
    		if(nums[i]<nums[i+1])
    		{
    			breakPoint=i;
    			break;
    		}
    	}
    	if(breakPoint==-1)
    	{
    		reverse( nums, 0, nums.length-1);
    		return;
    	}
    	int immediateGreater=breakPoint+1;
    	for(int i=breakPoint+1;i<nums.length;i++)
    	{
    		if(nums[immediateGreater]>nums[i] && nums[i]>nums[breakPoint])
    		{
    			immediateGreater=i;
    		}
    	}
    	if(breakPoint!=-1)
    	{
    		int temp=nums[breakPoint];
    		nums[breakPoint]=nums[immediateGreater];
    		nums[immediateGreater]=temp;
    	}
    	List<Integer> arrs=Arrays.stream(nums).boxed().collect(Collectors.toList());
//        List<Integer> sublist = arrs.subList(breakPoint+1,nums.length);
//    	Collections.reverse(sublist);
    	reverse(nums,breakPoint+1,nums.length-1);
    }
    public static void reverse(int[]nums,int start,int end)
    {
    	int j=start;
    	int center=(end+start)/2;
    	for(int i=end;i>center;i--)
    	{
    		int temp=nums[i];
    		nums[i]=nums[j];
    		nums[j]=temp;
    		j++;
    		
    	}
    }
}
