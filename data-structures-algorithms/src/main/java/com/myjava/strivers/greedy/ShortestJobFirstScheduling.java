package com.myjava.strivers.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ShortestJobFirstScheduling {

	public static float sjf(int[] arrivalTime, int[] burstTime) {
		Timing[] timings = new Timing[arrivalTime.length];
		for (int i = 0; i < arrivalTime.length; i++) {
			timings[i] = new Timing(arrivalTime[i], burstTime[i]);
		}
		Arrays.sort(timings, new TimingComparator());
		Timing lastTiming = timings[0];
		int sum = 0;
		for (int i = 1; i < timings.length; i++) {
			if (lastTiming.arrival == timings[i].arrival) {
				sum += lastTiming.burstTime;
				timings[i].burstTime += sum;
			} else {
				sum += timings[i].arrival;
				timings[i].burstTime += sum + lastTiming.burstTime;
			}
			lastTiming = timings[i];
		}
		float sums = sum;
		return (sums / timings.length);
	}
	
}

class Timing {
	int arrival;
	int burstTime;

	public Timing(int arrival, int burstTime) {
		super();
		this.arrival = arrival;
		this.burstTime = burstTime;
	}

}

class TimingComparator implements Comparator<Timing> {
	@Override
	public int compare(Timing o1, Timing o2) {
		if (o1.arrival < o2.arrival) {
			return -1;
		} else if (o1.arrival > o2.arrival) {
			return 1;
		} else {
			if (o1.burstTime < o2.burstTime) {
				return -1;
			} else if (o1.burstTime > o2.burstTime) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}