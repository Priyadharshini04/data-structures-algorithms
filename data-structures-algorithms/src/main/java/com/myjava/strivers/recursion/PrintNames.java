package com.myjava.strivers.recursion;

public class PrintNames {

	public static void print(int n) {
		printName(1,n);
	}
	public static void printName(int in, int num)
	{
		if(in>num)
			return;
	
		System.out.println("Priyadharshini");
		printName(++in,num);
	}
}
