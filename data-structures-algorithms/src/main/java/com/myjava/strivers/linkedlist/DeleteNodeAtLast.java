package com.myjava.strivers.linkedlist;

public class DeleteNodeAtLast {

	public static Node delete(Node list) {
		Node newNode = new Node();
		newNode=list;
		while(list.next!=null && list.next.next!=null)
		{
			list=list.next;
		}
		list.next=null;
		return newNode;
	}
}
