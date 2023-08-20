package com.myjava.strivers.sorting;

import static org.junit.Assert.assertArrayEquals;


import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void test1() {
		int[] arr=new int[] {41,467,334,500,169,724,478,358,962,464};
		BubbleSort.bubbleSort(arr,10);
		assertArrayEquals( new int[] {41, 169, 334, 358, 464, 467, 478, 500, 724, 962} , arr );
	}
}
