package com.myjava.strivers.graph;

public class WeightedVertex {
	int val;
	int weight;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public WeightedVertex(int val, int weight) {
		super();
		this.val = val;
		this.weight = weight;
	}

}
