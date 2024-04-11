package com.myjava.strivers.greedy;

import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/assign-cookies_8390826?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class AssignCookiesOne {
	public static int assignCookie(int[] greed, int[] size) {
		Arrays.sort(greed);
		Arrays.sort(size);
		int i = 0, j = 0;
		int count = 0;
		while (i < greed.length && j < size.length) {
			if (greed[i] <= size[j]) {
				count++;
				i++;
				j++;
			} else if (greed[i] > size[j]) {
				j++;
			} else {
				i++;
			}
		}
		return count;
	}
}
