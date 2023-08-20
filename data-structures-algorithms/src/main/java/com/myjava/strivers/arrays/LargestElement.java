package com.myjava.strivers.arrays;

public class LargestElement {
	public static void main(String[] args)
	{
		System.out.print(largestElement(new int[] { 4,7,8,6,7,6 }, 6));
	}

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max=arr[0];
        if(arr.length==1)
        {
            return n;
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;

    }
}
