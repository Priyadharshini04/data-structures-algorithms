package com.myjava.strivers.arrays;

// https://leetcode.com/problems/maximum-product-subarray/
public class MaxProductSubArray {
	public static int maxProduct(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int leftProd = 1;
		int rightProd = 1;
		int maxProduct = Integer.MAX_VALUE * -1;
		while (right >= 0 && left < nums.length) {
			if (maxProduct < nums[left]) {
				maxProduct = nums[left];
			}
			if (maxProduct < nums[right]) {
				maxProduct = nums[right];
			}
			leftProd *= nums[left++];
			rightProd *= nums[right--];
			if (leftProd > maxProduct) {
				maxProduct = leftProd;
			}
			if (rightProd > maxProduct) {
				maxProduct = rightProd;
			}
			leftProd = leftProd == 0 ? 1 : leftProd;
			rightProd = rightProd == 0 ? 1 : rightProd;

		}
		return maxProduct;
	}
}
