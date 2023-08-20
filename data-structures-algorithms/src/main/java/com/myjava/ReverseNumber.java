package com.myjava;


public class ReverseNumber {

	public static boolean isPalindromeNumber(int num) {
		int realNum=num;
		int total=1;
		while(num>10)
		{
			num=num/10;
			total*=10;
		}
		int div=realNum/10;
		int rem=realNum%10;
		long reversedNumber=rem*total;
		while(div>0)
		{
			rem=div%10;
			div=div/10;
			total/=10;
			reversedNumber+=rem*total;
		}
		return reversedNumber==realNum;
	}

}
