package com.myjava.strivers.recursion;

public class SumOfFirstnNumbers {

	public static int sumOfN(int total,int n)
	{
		total+=n;
		if(n==0)
			return total;
		return sumOfN(total,--n);
	}
}
