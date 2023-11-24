package com.myjava.strivers.binarysearch;

import java.util.Arrays;

public class FloorCeil {
	// https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401
	public static int[] ceilingInSortedArrays(int x, int[] arr) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int ceil = Integer.MAX_VALUE;
		int floor = Integer.MIN_VALUE;
		boolean isCeilSet = false;
		boolean isFloorSet = false;

		while (left <= right) {
			int mid = (left) + (right - left) / 2;
			if (arr[mid] == x) {
				ceil = x;
				isCeilSet = true;
				break;

			} else if (arr[mid] < x) {
				left = mid + 1;
			}
			if (arr[mid] > x) {
				if (arr[mid] < ceil) {
					ceil = arr[mid];
					isCeilSet = true;
				}
				right = mid - 1;
			}
		}
		left = 0;
		right = arr.length - 1;
		while (left <= right) {
			int mid = (left) + (right - left) / 2;
			if (arr[mid] == x) {
				floor = x;
				isFloorSet = true;
				break;

			} else if (arr[mid] > x) {
				right = mid - 1;
			}
			if (arr[mid] < x) {
				if (arr[mid] < ceil) {
					floor = arr[mid];
					isFloorSet = true;
				}
				left = mid + 1;
			}
		}

		if (!isCeilSet) {
			ceil = -1;
		}
		if (!isFloorSet) {
			floor = -1;
		}

		return new int[] { floor, ceil };
	}

	public static int[] ceilingInSortedArray(int x, int[] arr) {
		Arrays.sort(arr);
		int start = -1;
		int end = -1;
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == x) {
				return new int[] { arr[mid], arr[mid] };
			}
			if (arr[mid] < x) {
				start = mid;
				left = mid + 1;
			} else {
				end = mid;
				right = mid - 1;
			}
		}
		return (new int[] { start != -1 ? arr[start] : -1, end != -1 ? arr[end] : -1 });
	}
}
