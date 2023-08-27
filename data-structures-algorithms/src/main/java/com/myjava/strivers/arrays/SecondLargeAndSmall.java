package com.myjava.strivers.arrays;
//https://www.codingninjas.com/studio/problems/ninja-and-the-second-order-elements_6581960
public class SecondLargeAndSmall {
	
	public static int[] getSecondOrderElements(int n, int []a) {
        if(a.length==1)
        {
            return new int[]{a[0],a[0]};
        }
        int[] result=new int[2];
        int firstLargest=a[0]>a[1]?a[0]:a[1];
        int firstSmallest=a[0]<a[1]?a[0]:a[1];
        int secondLargest=firstSmallest;
        int secondSmallest=firstLargest;
        for(int i=0;i<n;i++)
        {
            if(a[i]>firstLargest)
            {
                secondLargest=firstLargest;
                firstLargest=a[i];
            }
            else if(a[i]>secondLargest && a[i]<firstLargest)
            {
                secondLargest=a[i];
            }
            if(a[i]<firstSmallest)
            {
                secondSmallest=firstSmallest;
                firstSmallest=a[i];
            }
            else if(a[i]<secondSmallest && a[i]>firstSmallest)
            {
                secondSmallest=a[i];
            }
        }
        result[0]=secondLargest;
        result[1]=secondSmallest;
        return result;
    }

}
