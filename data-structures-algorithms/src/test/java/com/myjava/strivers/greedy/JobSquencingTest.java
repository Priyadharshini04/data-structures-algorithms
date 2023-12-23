package com.myjava.strivers.greedy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class JobSquencingTest {
	@Test
	public void test1() {
		Job[] jobs = new Job[4];
		createJobs(new int[][] { { 1, 4, 20 }, { 2, 1, 10 }, { 3, 1, 40 }, { 4, 1, 30 } }, jobs);
		int[] result = JobSquencing.jobScheduling(jobs);
		assertArrayEquals(new int[] { 2, 60 }, result);
	}

	@Test
	public void test2() {
		Job[] jobs = new Job[4];
		createJobs(new int[][] { { 1, 2, 100 }, { 2, 1, 19 }, { 3, 2, 27 }, { 4, 1, 25 }, { 5, 1, 15 } }, jobs);
		int[] result = JobSquencing.jobScheduling(jobs);
		assertArrayEquals(new int[] { 2, 127 }, result);
	}

	public void createJobs(int[][] arr, Job[] jobs) {
		for (int i = 0; i < jobs.length; i++) {
			jobs[i] = new Job(arr[i][0], arr[i][1], arr[i][2]);
		}
	}
}
