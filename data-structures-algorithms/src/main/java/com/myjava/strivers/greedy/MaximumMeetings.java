package com.myjava.strivers.greedy;

import java.util.Arrays;
import java.util.Comparator;

// https://www.codingninjas.com/studio/problems/maximum-meetings_1062658
public class MaximumMeetings {
	// Missed Logic: Try to sort based on endTime instead of startTime.
	public static int maximumMeetingsss(int[] startTime, int[] endTime) {
		int[][] meets = new int[startTime.length][2];
		for (int i = 0; i < startTime.length; i++) {
			meets[i][0] = startTime[i];
			meets[i][1] = endTime[i];
		}
		Arrays.sort(meets, (a, b) -> a[1] - b[1]);
		int maxMeetingcount = 1;
		int endingAtTime = meets[0][1];
		for (int i = 1; i < meets.length; i++) {
			if (endingAtTime < meets[i][0]) {
				maxMeetingcount++;
				endingAtTime = meets[i][1];
			}
		}
		return maxMeetingcount;
	}

	public static int maximumMeetings(int[] startTime, int[] endTime) {
		Meeting[] meets = new Meeting[startTime.length];
		for (int i = 0; i < meets.length; i++) {
			meets[i] = new Meeting(startTime[i], endTime[i]);
		}
		Arrays.sort(meets, new MeetingSortAscending());
		int maxMeetingcount = 0;
		int count = 0;
		int j = 0;
		int meetingEndsAt = -1;
		while (j < meets.length) {
			if (meetingEndsAt < meets[j].startTime) {
				meetingEndsAt = meets[j].endTime;
				count++;
			}
			j++;
		}
		if (count > maxMeetingcount) {
			maxMeetingcount = count;
		}
		return maxMeetingcount;

	}

	public static int maximumMeetingss(int[] startTime, int[] endTime) {
		Meeting[] meets = new Meeting[startTime.length];
		for (int i = 0; i < meets.length; i++) {
			meets[i] = new Meeting(startTime[i], endTime[i]);
		}
		Arrays.sort(meets, new MeetingSort());
		int i = 0;
		int count = 0;
		int meetingEndsAt = -1;
		while (i < meets.length) {
			if (meetingEndsAt < meets[i].startTime) {
				meetingEndsAt = meets[i].endTime;
				count++;
			}
			i++;
		}
		return count;
	}

}

class Meeting {
	int startTime;
	int endTime;

	Meeting(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}
}

class MeetingSort implements Comparator<Meeting> {

	@Override
	public int compare(Meeting o1, Meeting o2) {
		if (o1.endTime - o1.startTime > o2.endTime - o2.startTime) {
			return 1;
		} else if (o1.endTime - o1.startTime < o2.endTime - o2.startTime) {
			return -1;
		}
		return 0;
	}

}

class MeetingSortAscending implements Comparator<Meeting> {

	@Override
	public int compare(Meeting o1, Meeting o2) {
		if (o1.endTime > o2.endTime) {
			return 1;
		} else if (o1.endTime < o2.endTime) {
			return -1;
		}
		return 0;
	}

}