package com.myjava.strivers.linkedlist;
///https://www.codingninjas.com/studio/problems/introduction-to-linked-list_8144737
public class ArrayToLinkedList {

	
	public static Node constructLL(int[] arr) {
		Node head=new Node(arr[0]);
		Node temp=head;
		for(int i=1;i<arr.length;i++)
		{
		Node curNode=new Node(arr[i]);
		temp.next=curNode;
		temp=curNode;
		}
		return head;
	}
	public static Node conLL(int[] arr)
	{
		Node head=null;
		Node tail=null;
		for(int i=0;i<arr.length;i++)
		{
            Node newNode=new Node(arr[i]);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=tail.next;
            }
		}
		return head;
	}
}

class Node {
	public int data;
	public Node next;

	Node() {
		this.data = 0;
		this.next = null;
	}

	Node(int data) {
		this.data = data;
		this.next = null;
	}

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}