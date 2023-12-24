package com.myjava.strivers.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class MinCostToConvertString_L100156 {
	public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
		long ans = 0L;
		Map<Character, List<Convert>> map = new HashMap<>();
		for (int i = 0; i < original.length; i++) {
			Convert con = new Convert(changed[i], cost[i]);
			if (map.containsKey(original[i])) {
				map.get(original[i]).add(con);
			} else {
				List<Convert> set = new ArrayList<Convert>();
				set.add(con);
				map.put(original[i], set);
			}
		}
		for (int i = 0; i < source.length(); i++) {
			char ch = source.charAt(i);
			boolean isFound = false;
			if (ch == target.charAt(i))
				continue;
			if (!map.containsKey(ch)) {
				return -1;
			}
			Iterator<Convert> iter = map.get(ch).iterator();

			int minCost = Integer.MAX_VALUE;
			while (iter.hasNext()) {
				boolean[] visited = new boolean[26];
				int currCost = 0;
				Convert conv = iter.next();
				if (conv.ch == target.charAt(i)) {
					currCost = conv.cost;
					minCost = Math.min(currCost, minCost);
					isFound = true;
				} else if (map.containsKey(conv.ch)) {
					Queue<Convert> queue = new ArrayDeque<Convert>();
					queue.offer(conv);
					int parentCost = conv.cost;
					while (!queue.isEmpty()) {
						conv = queue.poll();
						List<Convert> list = map.get(conv.ch);
						int j = 0;
						Convert temp;
						currCost = conv.cost;
						while (j < list.size()) {
							temp = list.get(j);
							if (temp.ch == target.charAt(i)) {
								currCost += temp.cost + parentCost - 1;
								minCost = Math.min(currCost, minCost);
								isFound = true;
							} else if (!visited[temp.ch - 'a']) {
								visited[temp.ch - 'a'] = true;
								queue.offer(temp);
							}
							j++;
						}
					}
				}
			}
			if (isFound) {
				ans = (ans + minCost) % (1000000007);
			} else {
				return -1;
			}
		}
		return ans;
	}
}

class Convert {
	char ch;
	int cost;

	public Convert(char ch, int cost) {
		super();
		this.ch = ch;
		this.cost = cost;
	}
}