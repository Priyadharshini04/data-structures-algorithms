package com.myjava.strivers.doublylinkedlist;

import java.util.*;
import java.util.Map;

public class FindPair {

	public static void pair(ListNode<Integer> head, int k, Map<Integer, Integer> map) {
		Set<Integer> set = new HashSet<Integer>();
		ListNode<Integer> traverse = head;
		while (traverse != null) {
			int rem = k - (traverse.data);
			if (set.contains(rem)) {
				map.put(rem, traverse.data);
			}
			set.add(traverse.data);
			traverse = traverse.next;
		}
		System.out.println(map.size());
		for (Map.Entry<Integer, Integer> mp : map.entrySet()) {
			System.out.println(mp.getKey() + " " + mp.getValue());
		}
	}
}
