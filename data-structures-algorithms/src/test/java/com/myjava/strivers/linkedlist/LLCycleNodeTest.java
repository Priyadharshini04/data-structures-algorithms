package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class LLCycleNodeTest {
	@Test
	public void test1() {
		int[] arr = new int[] { 4, 2, 5, 1, 20 };
		Node head = createCycleLL(arr,2);
		assertEquals(2,LLCycleNode.findCyclePosition(head).data);
	}
	
	@Test
	public void test2() {
		int[] arr = new int[] { 1,2 };
		Node head = createCycleLL(arr,1);
		assertEquals(1,LLCycleNode.findCyclePosition(head).data);
	}
	
	@Test
	public void test3() {
		int[] arr = new int[] { 4, 2, 5, 1, 20 };
		Node head = createCycleLL(arr,-1);
		assertNull(LLCycleNode.findCyclePosition(head));
	}

	public Node createCycleLL(int[] arr, int pos) {
		int i = 0;
		Node head=null;
		Node tail=null;
		Node cycle=null;
		while (i<arr.length) {
			if(head==null)
			{
				head=new Node(arr[i]);
				tail=head;
			}
			else if(i==pos)
			{
				Node curr=new Node(arr[i]);
				tail.next=curr;
				cycle=tail;
				tail=curr;
			}
			else { 
				Node curr=new Node(arr[i]);
				tail.next=curr;
				tail=curr;
			}
			
			i++;
		}
		if(pos!=-1)
		{
			tail.next=cycle;
		}
		assertEquals(arr.length, i);
		return head;
	}
}
