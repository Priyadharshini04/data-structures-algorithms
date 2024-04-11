package com.myjava;

import java.util.Arrays;
import java.util.List;

public class Solution3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		int result = 0;
		for (int val : list) {
			if (isPrime(val)) {
				result += (val * 3);
			}
		}
		System.out.println(result);
	}

	public static boolean isPrime(int val) {
		if (val == 1)
			return false;
		if (val < 4)
			return true;
		for (int i = 2; i <= val / 2; i++) {
			if (val % i == 0)
				return false;
		}
		return true;
	}
}
/*
 * Get the prime numbers from the below list and multiply each number by 3 and
 * get the sum at last
 * 
 * List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
 * 
 * o/p=2*3+3*3+5*3+7*3+11*3+13*3=123
 */