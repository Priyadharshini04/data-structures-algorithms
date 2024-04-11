package com.myjava.strivers.graph;

public class WeightParentPair {
	int weight;
	int parent;
	int val;

	public WeightParentPair(int weight, int parent, int val) {
		super();
		this.weight = weight;
		this.parent = parent;
		this.val = val;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

}
