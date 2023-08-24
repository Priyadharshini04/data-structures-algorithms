package com.myjava.strivers.linkedlist;
//https://leetcode.com/problems/delete-node-in-a-linked-list/
public class DeleteNode {

	public static void deleteNode(Node node) {
		Node temp=node.next;
		node.data=node.next.data;
		node.next=temp.next;
	}
	/*node.next=node.next.next will not work and just copying object reference  won't reflect 
	 * due the the previous object reference is pointing current (to be delete) object reference.
	Instead of changing object reference try to copy the things and override it 
	hence the previous object reference points to the same(to be deleted) object reference 
	but current(to be deleted) object reference which has next node's data.*/
}
