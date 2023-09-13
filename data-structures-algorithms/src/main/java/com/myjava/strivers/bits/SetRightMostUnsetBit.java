package com.myjava.strivers.bits;
// https://www.codingninjas.com/studio/problems/set-the-rightmost-unset-bit_8160456
public class SetRightMostUnsetBit {

	public static int setBit(int n) {
		int a=(n&(n+1));
		if(a==0)
		{
			return n;
		}
		return (n|(n+1));
	}

}
