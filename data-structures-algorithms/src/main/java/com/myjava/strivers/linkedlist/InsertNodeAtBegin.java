package com.myjava.strivers.linkedlist;

//https://www.codingninjas.com/studio/problems/insert-node-at-the-beginning_8144739
public class InsertNodeAtBegin {

	public static Node insertBeginLL(Node list,int newValue) {
		Node newNode=new Node(newValue, list );
		//newNode.next=list;
		return newNode;
	}

}
