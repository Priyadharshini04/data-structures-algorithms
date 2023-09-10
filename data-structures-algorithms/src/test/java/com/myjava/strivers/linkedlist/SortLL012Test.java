package com.myjava.strivers.linkedlist;

import java.util.Arrays;

import org.junit.Test;

public class SortLL012Test {
	SortLinkedListTest sortLinkedList=new SortLinkedListTest();
	@Test
	public void test1()
	{
		int arr[]=new int[] {2,1,0,2,1,0,0,2};
		Node ll1= SortLL012.sortList(ArrayToLinkedList.conLL(arr));
		Arrays.sort(arr);
		sortLinkedList.checkLLSorted(arr,ll1);
	}
	
	
}
