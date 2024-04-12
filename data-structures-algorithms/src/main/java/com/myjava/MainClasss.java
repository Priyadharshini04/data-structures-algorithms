package com.myjava;

public class MainClasss {
	public static void main(String[] args) {
		String str = "34567";
		int length = str.length();
		int result = 0;
		int number = 1;
		while (length-- > 1) {
			number *= 10; //10000
		}
		for (int i = 0; i < str.length(); i++) {
			result += ((str.charAt(i) - '0') * number);
			number /= 10;
		}
		System.out.println(result);
		int a,b;
		for(a=1,b=4;a<b;a++,b--)
		{
			System.out.println("a="+a);
			System.out.println("b="+b);

		}
	}
}
