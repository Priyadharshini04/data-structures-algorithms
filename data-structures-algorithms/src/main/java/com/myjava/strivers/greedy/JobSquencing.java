package com.myjava.strivers.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class JobSquencing {

	public static int[] jobScheduling(Job[] jobs) {
		int[] days = new int[jobs.length];
		Arrays.sort(jobs, new JobComparator());
		int taskCount = 0;
		int maxProfit = 0;
		for (int i = 0; i < jobs.length; i++) {
			if (days[jobs[i].deadline - 1] == 0) {
				maxProfit += jobs[i].profit;
				days[jobs[i].deadline - 1] = jobs[i].id;
				++taskCount;
			} else {
				int j = jobs[i].deadline - 2;
				while (j >= 0) {
					if (days[j] == 0) {
						maxProfit += jobs[i].profit;
						days[j] = jobs[i].id;
						++taskCount;
						break;
					}
					--j;
				}
			}
		}
		return new int[] { taskCount, maxProfit };
	}

}

class Job {
	int id, profit, deadline;

	Job(int x, int y, int z) {
		this.id = x;
		this.deadline = y;
		this.profit = z;
	}
}

class JobComparator implements Comparator<Job> {

	@Override
	public int compare(Job o1, Job o2) {
		if (o1.profit > o2.profit) {
			return -1;
		} else if (o1.profit < o2.profit) {
			return 1;
		}
		return 0;
	}

}