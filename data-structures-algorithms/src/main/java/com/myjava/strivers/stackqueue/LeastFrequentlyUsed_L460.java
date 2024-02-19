package com.myjava.strivers.stackqueue;

import java.util.HashMap;
import java.util.LinkedList;

//https://leetcode.com/problems/lfu-cache/description/
public class LeastFrequentlyUsed_L460 {
	int capacity;
	HashMap<Integer, MyNode> map;
	HashMap<Integer, LinkedList<MyNode>> freqMap;

	MyNode tail;

	public LeastFrequentlyUsed_L460(int capacity) {
		this.capacity = capacity;
		map = new HashMap<Integer, MyNode>();
		freqMap = new HashMap<Integer, LinkedList<MyNode>>();
	}

	public int get(int key) {
		MyNode node = map.getOrDefault(key, null);
		if (node != null) {
			LinkedList<MyNode> list = freqMap.get(node.usage);
			list.remove(node);
			node.usage += 1;
			LinkedList<MyNode> newList = freqMap.getOrDefault(node.usage, new LinkedList<MyNode>());
			newList.add(0, node);
			freqMap.put(node.usage, newList);
			map.put(key, node);
			return node.value;
		}
		return -1;

	}

	public void put(int key, int value) {
		MyNode temp;
		if (map.containsKey(key)) {
			MyNode newNode = map.get(key);

			LinkedList<MyNode> list = freqMap.get(newNode.usage);
			list.remove(newNode);
			newNode.value = value;
			newNode.usage += 1;
			map.put(key, newNode);
			list = freqMap.getOrDefault(newNode.usage, new LinkedList<MyNode>());
			list.add(0, newNode);
			freqMap.put(newNode.usage, list);
		} else {
			if (capacity == map.size()) {
				int i = 1;
				while (freqMap.get(i).isEmpty()) {
					i++;
				}
				LinkedList<MyNode> getRemovalList = freqMap.get(i);
				MyNode removalNode = getRemovalList.removeLast();
				map.remove(removalNode.key);
			}
			LinkedList<MyNode> list;
			if (freqMap.containsKey(1)) {
				list = freqMap.get(1);
			} else {
				list = new LinkedList<MyNode>();
			}
			temp = new MyNode(key, value, 1);
			list.add(0, temp);
			freqMap.put(1, list);
			map.put(key, temp);
		}
	}
}
