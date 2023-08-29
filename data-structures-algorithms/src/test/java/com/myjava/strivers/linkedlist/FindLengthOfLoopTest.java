package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindLengthOfLoopTest {
	@Test
	public void test1() {
		Node[] nodes = createLoopedLL(new int[] { 4, 10, 3, 5 }, 1);
		assertEquals(3, FindLengthOfLoop.findLength(nodes[0]));
	}

	@Test
	public void test2() {
		Node[] nodes = createLoopedLL(new int[] { 4, 10, 3, 5 }, 0);
		assertEquals(4, FindLengthOfLoop.findLength(nodes[0]));
	}

	private Node[] createLoopedLL(int[] a, int ins1) {
		Node head1 = null;
		Node tail1 = null;
		Node intersec = null;
		int i = 0;
		while (i < a.length) {

			if (head1 == null) {
				head1 = new Node(a[i]);
				tail1 = head1;
				if (i == ins1) {
					intersec = head1;
				}
			} else {
				Node curr1 = new Node(a[i]);
				if (i == ins1) {
					intersec = curr1;
				}
				tail1.next = curr1;
				tail1 = curr1;
			}
			i++;
		}
		tail1.next = intersec;
		return new Node[] { head1, intersec };
	}
}
