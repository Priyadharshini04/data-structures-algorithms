package com.myjava.strivers.linkedlist;

import java.util.*;

// https://leetcode.com/problems/intersection-of-two-linked-lists/
public class InterSectionNode {

	// Brute force approach O(n*n)
	public static Node getInterSectionNode(Node headA, Node headB) {
		Node tail1 = headA;
		Node tail2 = headB;
		while (tail1 != null) {
			Node curr2 = tail2;
			while (curr2 != null) {
				if (tail1 == curr2) {
					return tail1;
				}
				curr2 = curr2.next;
			}
			tail1 = tail1.next;
		}
		return null;
	}

	// O(n+m)
	public static Node getInterSectionNodeOpti(Node headA, Node headB) {
		Node tail1 = headA;
		Node tail2 = headB;
		Set<Node> set = new HashSet<Node>();
		while (tail1 != null) {
			if (tail2 == tail1) {
				return tail1;
			}
			set.add(tail1);
			tail1 = tail1.next;
		}

		while (tail2 != null) {
			if (set.contains(tail2)) {
				return tail2;
			}
			tail2=tail2.next;
		}
		return null;
	}

}
