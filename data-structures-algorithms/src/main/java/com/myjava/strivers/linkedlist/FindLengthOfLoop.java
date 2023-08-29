package com.myjava.strivers.linkedlist;

import java.util.HashMap;

//https://www.codingninjas.com/studio/problems/find-length-of-loop_8160455
public class FindLengthOfLoop {

	public static int findLength(Node head) {
		if (head == null || head.next == null) {
			return 0;
		}
		Node temp = head;
		HashMap<Node, Integer> hm = new HashMap<Node, Integer>();
		int i = 1;
		while (temp != null) {
			if (hm.containsKey(temp)) {
				return i - hm.get(temp);
			}
			hm.put(temp, i);
			temp = temp.next;
			i++;
		}
		return 0;
	}

}
