package com.myjava.strivers.arrays;

import java.util.Arrays;

public class Move0AtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( Arrays.toString(moveZeros(5,new int[] {4,0,3,2,5})) );
		System.out.println( Arrays.toString(moveZero(5,new int[] {4,0,3,2,5})) );

	}
    public static int[] moveZeros(int n, int []a) {
    // Write your code here.
    	for(int i=0;i<a.length;i++)
    	{
    			int j=i;
    			while(j<a.length && a[j]==0 )
    			{
    				j++;
    			}
                if(a[i]<=0 && j<a.length)
                {
    			a[i]=a[j];
    			a[j]=0;
                }
    	}
    	return a;
    }
    
    public static int[] moveZero(int n, int []a) {
    // Write your code here.
    	int count=0;
    	int j=0;
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]<=0)
    		{
    			count+=1;
    		}
    		else {
    			a[j]=a[i];
    			j++;
    		}
    	}
    	while(j<a.length)
    	{
    		a[j]=0;
    		j++;
    	}
    	return a;
    }

}
