package com.myjava.strivers.greedy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;

//https://www.codingninjas.com/studio/problems/minimum-number-of-platforms_799400
public class CalculateMinPlatforms {

	// The own Solution works for all the test cases but got TLE. Tried with map and
	// queue but TLE.
	// use two pointer approach to solve the problem.
	// No need to sort it combined manner.
	public static int findPlatform(int arrival[], int depature[]) {
		int maxplatForm = 1;
		int left = 0;
		int right = 1;
		int platForm = 1;
		Arrays.sort(arrival);
		Arrays.sort(depature);
		while (right < arrival.length && left <= right) {
			if (arrival[right] <= depature[left]) {
				++platForm;
			} else if (arrival[right] > depature[left]) {
				left++;
			}
			if (platForm > maxplatForm) {
				maxplatForm = platForm;
			}
			right++;
		}
		return maxplatForm;
	}

	public static int findPlatformss(int[] arrival, int[] depature) {
		TrainTiming[] trainTimings = new TrainTiming[arrival.length];
		for (int i = 0; i < arrival.length; i++) {
			trainTimings[i] = new TrainTiming(arrival[i], depature[i]);
		}
		Arrays.sort(trainTimings, new TrainTimingComparator());
		int maxplatForm = 1;
		int left = 0;
		int right = 1;
		int platForm = 1;
		while (right < trainTimings.length && left <= right) {
			if (!(compareDepatureWithArrival(trainTimings[left].depature, trainTimings[right].arrival))) {
				left++;
			} else {
				platForm += 1;
			}
			maxplatForm = Math.max(maxplatForm, platForm);
			right++;
		}
		return maxplatForm;
	}

	public static int findPlatforms(int[] arrival, int[] depature) {
		Map<Integer, TrainTiming> list = new LinkedHashMap<Integer, TrainTiming>();
		Queue<Integer> queue = new ArrayDeque<Integer>();
		TrainTiming[] trainTimings = new TrainTiming[arrival.length];
		for (int i = 0; i < arrival.length; i++) {
			trainTimings[i] = new TrainTiming(arrival[i], depature[i]);
		}
		Arrays.sort(trainTimings, new TrainTimingComparator());
		int size = 1;
		queue.offer(trainTimings[0].depature);
		for (int i = 1; i < trainTimings.length; i++) {
			if (!queue.isEmpty() && !compareDepatureWithArrival(queue.peek(), trainTimings[i].arrival)) {
				queue.offer(trainTimings[i].depature);
				size++;
			} else {
				if (!queue.isEmpty())
					queue.poll();
				queue.offer(trainTimings[i].depature);
			}
		}
		return size;
	}

	public static boolean compareDepatureWithArrival(int departure, int arrival) {
		if (departure >= 1200 && arrival < 10) {
			// depature is less than arrival
			return true;
		} else if (departure > 10 && departure < 1000 && arrival < 10) {
			return false;
		} else {
			return departure >= arrival;
		}
	}

}

class TrainTiming {
	int arrival;
	int depature;

	public TrainTiming(int arrival, int depature) {
		super();
		this.arrival = arrival;
		this.depature = depature;
	}
}

class TrainTimingComparator implements Comparator<TrainTiming> {

	@Override
	public int compare(TrainTiming o1, TrainTiming o2) {
		{
			if (o1.depature < o2.depature) {
				return -1;
			} else if (o1.depature > o2.depature) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}

class TrainTimingComparators implements Comparator<TrainTiming> {

	@Override
	public int compare(TrainTiming o1, TrainTiming o2) {
		if (o1.arrival < o2.arrival) {
			return -1;
		} else if (o1.arrival > o2.arrival) {
			return 1;
		} else {
			return 0;
		}
	}
}