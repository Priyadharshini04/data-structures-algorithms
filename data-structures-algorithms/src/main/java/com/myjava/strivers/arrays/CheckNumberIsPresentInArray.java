package com.myjava.strivers.arrays;

public class CheckNumberIsPresentInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}	
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]==num)
    		{
    			return i;
    		}
    	}
    	return -1;
    }

}
