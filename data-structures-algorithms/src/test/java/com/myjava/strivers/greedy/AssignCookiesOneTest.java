package com.myjava.strivers.greedy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AssignCookiesOneTest {
	@Test
	public void test1() {
		int[] arr1 = { 306, 408, 201, 78, 477, 264, 39, 254, 37, 128, 153, 112, 445, 276, 100, 246, 28, 381, 384, 300,
				373, 98, 398, 33, 142, 297, 103, 423, 18, 415, 238, 85, 187, 265 };
		int[] arr2 = { 233, 93, 264, 291, 70, 490, 236, 495, 201, 178, 285, 120, 77, 32, 233, 401, 367, 434, 214, 243,
				358, 313, 419, 433, 215, 46, 326 };
		int result = AssignCookiesOne.assignCookie(arr1, arr2);
		assertEquals(27, result);
	}
}
