package com.myjava;

import java.util.ArrayList;
import java.util.List;

public class MyNewMain {
	public static void main(String[] args) {
		int[] product = new int[] { 10, 20, 30, 40, 40, 50, 60, 60 };
		boolean[] visited = new boolean[product.length];
		List<Integer> payableAmt = new ArrayList<Integer>();
		List<Integer> disCountAmt = new ArrayList<Integer>();
		rule1(payableAmt, disCountAmt, product, visited);
		rule2(payableAmt, disCountAmt, product, visited);
		rule3(payableAmt, disCountAmt, product, visited);
		System.out.println(payableAmt);
		System.out.println(disCountAmt);

	}

	public static void rule1(List<Integer> payableAmt, List<Integer> disCountAmt, int[] product, boolean[] visited) {
		for (int i = product.length - 1; i >= 0; i--) {
			if (!visited[i]) {
				if (i - 1 >= 0) {
					disCountAmt.add(product[i - 1]);
					visited[i - 1] = true;
				}
				payableAmt.add(product[i]);
				visited[i] = true;
			}
		}
	}

	public static void rule2(List<Integer> payableAmt, List<Integer> disCountAmt, int[] product, boolean[] visited) {
		for (int i = product.length - 1; i >= 0; i--) {
			if (!visited[i]) {
				for (int j = i - 1; j >= 0; j--) {
					if (!visited[j] && product[j] < product[i]) {
						disCountAmt.add(product[j]);
						visited[i - 1] = true;
						break;
					}
				}
				payableAmt.add(product[i]);
				visited[i] = true;
			}
		}
	}

	public static void rule3(List<Integer> payableAmt, List<Integer> disCountAmt, int[] product, boolean[] visited) {
		for (int i = product.length - 1; i >= 0; i--) {
			if (!visited[i]) {
				int maxDiscount = 0;
				int[] discount = new int[2];
				int maxIdx = i - 1;
				for (int j = i - 1; j >= 0; j--) {
					if (!visited[j]) {
						int firstProduct = -1;
						int secondProduct = -1;
						for (int k = i - 1; k >= 0; k--) {
							if (!visited[k] && product[k] < product[i] && k != j) {
								if (firstProduct == -1) {
									firstProduct = k;
								} else if (secondProduct == -1 && product[k] < product[j]) {
									secondProduct = k;
								}
							}
						}
						if (firstProduct != -1 && secondProduct != -1
								&& product[firstProduct] + product[secondProduct] > maxDiscount) {
							maxDiscount = product[firstProduct] + product[secondProduct];
							discount[0] = firstProduct;
							discount[1] = secondProduct;
							maxIdx = j;
						}
					}

				}
				payableAmt.add(product[i]);
				if (maxIdx >= 0) {
					payableAmt.add(product[maxIdx]);
					visited[maxIdx] = true;

				}
				if (discount[0] != -1) {
					disCountAmt.add(product[discount[0]]);
					visited[discount[0]] = true;
				}
				if (discount[1] != -1) {
					disCountAmt.add(product[discount[1]]);
					visited[discount[1]] = true;
				}
				visited[i] = true;
			}
		}
	}
}
