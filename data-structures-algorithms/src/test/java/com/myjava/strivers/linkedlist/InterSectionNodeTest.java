package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class InterSectionNodeTest {
	@Test
	public void test1() {
		Node[] nodes = createTwoLLWithIntersection(new int[] { 4, 1, 8, 4, 5 }, new int[] { 5, 6, 1, 8, 4, 5 }, 2, 3);
		assertEquals(nodes[2], InterSectionNode.getInterSectionNodeOpti(nodes[0], nodes[1]));
	}

	@Test
	public void test2() {
		Node[] nodes = createTwoLLWithIntersection(new int[] { 1, 9, 1, 2, 4 }, new int[] { 3, 2, 4 }, 3, 1);
		assertEquals(nodes[2], InterSectionNode.getInterSectionNodeOpti(nodes[0], nodes[1]));
	}

	@Test
	public void test3() {
		Node[] nodes = createTwoLLWithIntersection(new int[] { 2, 6, 4 }, new int[] { 1, 5 }, 3, 2);
		assertNull(InterSectionNode.getInterSectionNodeOpti(nodes[0], nodes[1]));
	}

	private Node[] createTwoLLWithIntersection(int[] a, int[] b, int ins1, int ins2) {
		Node head1 = null;
		Node tail1 = null;
		Node head2 = null;
		Node tail2 = null;
		Node intersec = null;
		int i = 0;
		int j = 0;
		while (i < ins1) {
			if (head1 == null) {
				head1 = new Node(a[i]);
				tail1 = head1;
			} else {
				Node curr1 = new Node(a[i]);
				tail1.next = curr1;
				tail1 = curr1;
			}
			i++;
		}
		while (j < ins2) {
			if (head2 == null) {
				head2 = new Node(b[j]);
				tail2 = head2;
			} else {
				Node curr2 = new Node(b[j]);
				tail2.next = curr2;
				tail2 = curr2;
			}
			j++;
		}
		while (i < a.length || j < b.length) {
			Node curr = new Node(a[i]);
			tail1.next = curr;
			tail2.next = curr;
			tail1 = curr;
			tail2 = curr;
			if (intersec == null)
				intersec = curr;

			i++;
			j++;
		}
		return new Node[] { head1, head2, intersec };
	}
}
