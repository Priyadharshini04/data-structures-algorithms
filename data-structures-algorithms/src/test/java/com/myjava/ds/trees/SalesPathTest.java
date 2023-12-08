package com.myjava.ds.trees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SalesPathTest {
	@Test
	public void test1() {
		Node node = new Node(0);
		node.children = new Node[3];
		node.children[0] = new Node(5);
		node.children[0].children = new Node[] { new Node(4) };
		node.children[1] = new Node(3);
		node.children[1].children = new Node[2];
		node.children[1].children[0] = new Node(2);
		node.children[1].children[0].children = new Node[1];
		node.children[1].children[0].children[0] = new Node(1);
		node.children[1].children[0].children[0].children = new Node[] { new Node(1) };
		node.children[1].children[1] = new Node(0);
		node.children[1].children[1].children = new Node[] { new Node(10) };
		node.children[2] = new Node(6);
		node.children[2].children = new Node[] { new Node(1), new Node(5) };
		assertEquals(7, new SalesPath().getCheapestCost(node));
	}
}
