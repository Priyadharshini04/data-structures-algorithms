package com.myjava.strivers.recursion;

import java.util.List;

public class FactorialOfNumber {
	// https://www.codingninjas.com/studio/problems/factorial-numbers-not-greater-than-n_8365435
	
	public static List<Long> factorialNumber(Long n,Long max, List<Long> list, Long fact)
	{
		fact=fact*n;
		if(fact>max)
			return list;
		list.add(fact);
		return factorialNumber(++n,max,list,fact);
	}
}
