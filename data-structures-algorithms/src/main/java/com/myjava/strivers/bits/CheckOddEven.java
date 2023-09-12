package com.myjava.strivers.bits;
// https://www.codingninjas.com/studio/problems/odd-even_7993579
public class CheckOddEven {

	public static String oddEven(int i) {
		if((i^(i-1))==1)
		{
			return "odd";
		}
		return "even";
	}

}
