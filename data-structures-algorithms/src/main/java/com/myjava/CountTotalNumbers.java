package com.myjava;

public class CountTotalNumbers {
	public static int totalCount(int num) {
		int total=0;
		while(num>0)
		{
			num=num/10;
			total+=1;
		}
		return total;
    }
}
