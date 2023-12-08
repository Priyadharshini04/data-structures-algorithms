package com.myjava.ds.trees;

public class Node {
	int cost;
	Node[] children;
	Node parent;

	Node(int cost) {
		this.cost = cost;
		children = null;
		parent = null;
	}

	Node(int cost, int length) {
		this.cost = cost;
		children = new Node[length];
		parent = null;
	}
}
