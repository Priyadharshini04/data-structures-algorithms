package com.myjava.strivers.stackqueue;

import java.util.HashMap;

//https://leetcode.com/problems/lru-cache/
public class LeastRecentlyUsedCache_L146 {
	int capacity;
	HashMap<Integer, MyNode> map;
	MyNode node;
	MyNode tail;
	MyNode prev;

	public LeastRecentlyUsedCache_L146(int capacity) {
		this.capacity = capacity;
		map = new HashMap<>();
	}

	public int get(int key) {
		MyNode data = map.getOrDefault(key, null);
		if (data != null) {
			MyNode temp = node;
			if (data.next != null) {
				if (temp == data) {
					node = node.next;
					node.prev = null;
					data.prev = prev;
					tail.next = data;
					tail = tail.next;
					prev = tail;
				} else {
					data.prev.next = data.next;
					data.next.prev = data.prev;
					data.prev = prev;
					tail.next = data;
					tail = tail.next;
					prev = tail;
				}
				data.next = null;
			}
			return data.value;
		}
		return -1;
	}

	public void put(int key, int value) {
		MyNode temp = null;
		if (map.containsKey(key)) {
			this.get(key);
			MyNode tempNode = map.get(key);
			tempNode.value = value;
			map.put(key, tempNode);
		} else {
			if (capacity == map.size()) {
				int removalKey = node.key;
				node = node.next;
				if (node != null)
					node.prev = null;
				map.remove(removalKey);
			}
			temp = new MyNode(key, value, 0);
			if (node == null) {
				node = temp;
				tail = node;
				prev = tail;
			} else {
				temp.prev = prev;
				tail.next = temp;
				tail = tail.next;
				prev = tail;
			}
			map.put(key, temp);
		}
	}
}

class MyNode {
	int key;
	int value;
	MyNode next;
	MyNode prev;
	int usage;

	MyNode(int key, int value, int usage) {
		this.key = key;
		this.value = value;
		this.usage = usage;
	}
}