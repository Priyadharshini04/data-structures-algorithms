package com.myjava.strivers.arrays;

public class CheckArrayIsSorted {
    public static int isSorted(int n, int []a) {
    	
        int center=n/2;
        for(int i=0;i<center&&center<n;i++)
        {
            if(a[i]>a[center])
            {
                return 0;
            }
            center++;
        }
        return 1;
    }
}
