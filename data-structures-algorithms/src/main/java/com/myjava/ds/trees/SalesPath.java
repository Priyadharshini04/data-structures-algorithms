package com.myjava.ds.trees;

// https://www.pramp.com/challenge/15oxrQx6LjtQj9JK9XqA
public class SalesPath {
	int minSalesPath = Integer.MAX_VALUE;
	int result = Integer.MAX_VALUE;
	public int getCheapestCost(Node rootNode) {
//		int sum = getCheapestCostPath(rootNode, new int[rootNode.children.length]);
//		return sum;
		if (rootNode == null)
			return 0;

		findCheapest(rootNode, rootNode.cost);
		return result;
	}

	private int getCheapestCostPath(Node rootNode, int[] childSum) {
		if (rootNode == null) {
			return 0;
		}
		int sum = 0;
		if (rootNode.children != null) {
			for (int i = 0; i < rootNode.children.length; i++) {
				childSum[i] = getCheapestCostPath(rootNode.children[i],
						(rootNode.children[i].children != null ? new int[rootNode.children[i].children.length]
								: new int[0]));
			}
			if (childSum.length > 0) {
				sum = childSum[0];
			}
			for (int i = 1; i < childSum.length; i++) {
				if (sum > childSum[i]) {
					sum = childSum[i];
				}
			}
		}
		return rootNode.cost + sum;
	}
	
	void findCheapest(Node root, int sum)
    {
      if(root == null) return;
      
      if(root.children == null)
      {
        result = Math.min(result,sum);
        return;
      }
      
      for(Node children: root.children)
      {
        findCheapest(children,sum+children.cost);
      }      
    }
}
