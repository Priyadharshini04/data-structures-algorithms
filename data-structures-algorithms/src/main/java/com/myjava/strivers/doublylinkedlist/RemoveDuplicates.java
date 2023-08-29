package com.myjava.strivers.doublylinkedlist;

public class RemoveDuplicates {

	public static Node removeDuplicate(Node head) {
		Node temp=head;
		if(head==null)
		{
			return null;
		}
		while(temp!=null)
		{
			if(temp.next!=null && temp.data==temp.next.data)
			{
				temp.next=temp.next.next;
				if(temp.next!=null)
				temp.next.prev=temp;
			}
			if(temp.prev!=null && temp.data==temp.prev.data)
			{
				temp.data=temp.next.data;
				temp.next.prev=temp.prev;
				temp.next=temp.next.next;
			}
			temp=temp.next;
		}
		return head;
	}

}
