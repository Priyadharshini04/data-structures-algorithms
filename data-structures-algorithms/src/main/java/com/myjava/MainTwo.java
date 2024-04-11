package com.myjava;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MainTwo {
	public static void main(String[] args) {
//		TopVotedCandidate topVotedCandidate = new TopVotedCandidate(new int[] { 0, 1, 1, 0, 0, 1, 0 },
//				new int[] { 0, 5, 10, 15, 20, 25, 30 });
		TopVotedCandidate topVotedCandidate = new TopVotedCandidate(new int[] { 0, 0, 1, 1, 2 },
				new int[] { 0, 67, 69, 74, 87 });
		// int[] times = new int[] { 3, 12, 25, 15, 24, 8 };
		// [[[0,0,1,1,2],[0,67,69,74,87]],[4],[62],[100],[88],[70],[73],[22],[75],[29],[10]]
		int[] times = new int[] { 4, 62, 100, 88, 70, 73, 22, 75, 29, 10 };
		for (int i = 0; i < times.length; i++) {
			System.out.println(topVotedCandidate.q(times[i]));
		}
	}
}

class TopVotedCandidate {
	int[] persons;
	int[] times;
	int[] winner;

	public TopVotedCandidate(int[] persons, int[] times) {
		this.persons = persons;
		this.times = times;
		this.winner = new int[times.length];
		for (int i = 0; i < winner.length; i++) {
			winner[i] = -1;
		}
	}

	public int q(int t) {
		Map<Integer, Integer> map = new HashMap<>();
		PriorityQueue<Map<Integer, Integer>> pq = new PriorityQueue<Map<Integer, Integer>>();
		int currWinner = -1;
		// O(q)
		for (int i = 0; i < times.length && times[i] <= t; i++) {
			if (map.containsKey(persons[i])) {
				map.put(persons[i], map.get(persons[i]) + 1); // 0,1,=>1,1
			} else {
				map.put(persons[i], 1);
			}
			currWinner = persons[i];
		}
		// number of persons
		int maxVotes = 0;
		int maxPerson = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (maxVotes < entry.getValue()) {
				maxVotes = entry.getValue();
				maxPerson = entry.getKey();
			}
		}
		if (map.getOrDefault(currWinner, 0) == maxVotes) {
			return currWinner;
		}
		return maxPerson;
	}
}