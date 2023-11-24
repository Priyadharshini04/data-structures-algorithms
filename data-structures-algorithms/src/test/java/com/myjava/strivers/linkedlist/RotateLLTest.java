package com.myjava.strivers.linkedlist;

import org.junit.Test;

public class RotateLLTest {
	@Test
	public void test1() {
		Node head = ArrayToLinkedList.constructLL(new int[] { 1, 2, 3, 4, 5 });
		Node actual = new RotateLL().rotateRight(head, 2);
		new AddOneAsNumberTest().assertData(new int[] { 4, 5, 1, 2, 3 }, actual);
	}
	
	@Test
	public void test2() {
		Node head = ArrayToLinkedList.constructLL(new int[] { 0,1,2 });
		Node actual = new RotateLL().rotateRight(head, 4);
		new AddOneAsNumberTest().assertData(new int[] { 2,0,1 }, actual);
	}
}
