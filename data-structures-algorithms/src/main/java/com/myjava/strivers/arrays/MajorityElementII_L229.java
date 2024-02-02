package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/majority-element-ii/
public class MajorityElementII_L229 {

	public static List<Integer> findMajority(int[] nums) {
		Arrays.sort(nums);
		int count = 1;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i+1<nums.length && nums[i] == nums[i + 1]) {
				count++;
			} else {
				if (count > nums.length / 3) {
					list.add(nums[i]);
				}
				count = 1;
			}
		}
		return list;
	}

}
