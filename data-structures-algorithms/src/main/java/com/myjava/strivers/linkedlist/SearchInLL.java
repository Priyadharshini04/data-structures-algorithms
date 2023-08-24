package com.myjava.strivers.linkedlist;
//https://www.codingninjas.com/studio/problems/search-in-a-linked-list_975381
public class SearchInLL {

	public static int findElement(Node head, int k) {
		int ele=0;
		Node newNode=new Node();
		newNode=head;
		while(newNode!=null)
		{
			if(newNode.data==k)
			{
				return 1;
			}
			newNode=newNode.next;
		}
		return ele;
	}

}
