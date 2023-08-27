package com.myjava.strivers.arrays;
// https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957
public class CheckArrayIsSorted {
    public static int isSorted(int n, int []a) {
    	
        int center=n/2;
        int j=center;
        for(int i=0;i<j&&j<n;i++)
        {
            if(a[i]>a[j])
            {
                return 0;
            }
            j++;
        }
        if(center <n && center+1<n && a[center]>a[center+1])
        {
        	return 0;
        }
        
        if(center <n && (center+1<n && a[center]<a[center+1]) || (center-1<n && a[center]<a[center-1]) )
        {
        	
        }
        return 1;
    }
}
