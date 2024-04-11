package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

public class BallsSelection {

	public static List<List<Integer>> doDifferentSelection() {
		int[] scores = new int[] { 0, 1, 2, 3, 4, 6 };
		int maxScore = 30;
		int maxBalls = 10;
		List<List<Integer>> resultList = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		calculateScores(resultList, list, scores, maxScore, maxBalls, 5);
		resultList.stream().forEach(System.out::println);
		return resultList;
	}

	static void calculateScores(List<List<Integer>> resultList, List<Integer> list, int[] scores, int maxScore,
			int maxBalls, int idx) {
		if (maxScore < 0) {
			return;
		}
		if (maxScore == 0) {
			resultList.add(new ArrayList<>(list));
			return;
		}
		if (maxBalls == 0) {
			return;
		}
		for (int i = 0; i < scores.length; i++) {
			maxScore -= scores[i];
			list.add(scores[i]);
			calculateScores(resultList, list, scores, maxScore, maxBalls - 1, i);
			maxScore += scores[i];
			list.remove(list.size()-1);
		}
	}
}
