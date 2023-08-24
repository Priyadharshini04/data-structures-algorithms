package com.myjava.strivers.linkedlist;
//https://www.codingninjas.com/studio/problems/count-nodes-of-linked-list_5884
public class CountNodesOfList {

	public static int count(Node head) {
		int count=0;
		Node newNode=new Node();
		newNode=head;
		while(newNode!=null)
		{
			newNode=newNode.next;
			count+=1;
		}
		return count;
	}

}
