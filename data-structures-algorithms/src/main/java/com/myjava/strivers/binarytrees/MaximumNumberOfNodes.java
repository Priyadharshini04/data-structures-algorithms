package com.myjava.strivers.binarytrees;
// https://www.codingninjas.com/studio/problems/number-of-nodes_8162204
public class MaximumNumberOfNodes {

	public static int numberOfNodes(int N) {
		//1<<(N-1) use left shift instead.
		return (int) Math.pow(2, N-1);
	}
	
}
