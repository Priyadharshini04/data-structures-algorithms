package com.myjava.strivers.arrays;

// https://www.codingninjas.com/studio/problems/ninja-and-the-sorted-check_6581957
public class CheckArrayIsSorted {
    public static int isSorted(int n, int []a) {
    	
    	 for (int i = 0; i < n - 1; i++) {
             if (a[i + 1] < a[i]) {
                 return 0;
             }
         }
         return 1;
    }
}
