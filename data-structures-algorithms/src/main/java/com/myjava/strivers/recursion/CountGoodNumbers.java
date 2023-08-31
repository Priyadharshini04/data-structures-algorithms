package com.myjava.strivers.recursion;
// https://leetcode.com/problems/count-good-numbers/description/
public class CountGoodNumbers {
	static int  module = (int) 1e9 + 7; // to control integer overflow.
	public static int count(long n) {
		long evenPlace = (n % 2 == 0) ? n / 2 : (n / 2) + 1;
		long oddPlace = n / 2;
		long mul1 = (long) power(5, evenPlace);
		long mul2 = (long) power(4, oddPlace);
		long ans = 1;
		ans = (ans * mul1) % module;
		ans = (oddPlace != 0) ? (ans * mul2) % module : ans;
		return (int) (ans % module);
	}
	public static long power(long x, long y)
	{
		if(y==0) return 1;
		long temp=power(x,y/2);
		if(y%2==0) return (temp*temp)%module;
		else return (x*temp*temp)%module;
		
	}
}
