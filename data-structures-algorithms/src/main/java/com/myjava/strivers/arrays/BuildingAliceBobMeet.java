package com.myjava.strivers.arrays;


// https://leetcode.com/contest/weekly-contest-372/problems/find-building-where-alice-and-bob-can-meet/
public class BuildingAliceBobMeet {

	public static int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
		int[] answer = new int[queries.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i]=-1;
			int alicePoint = queries[i][0];
			int bobPoint = queries[i][1];
			if(alicePoint==bobPoint)
			{
				answer[i]=alicePoint;
				continue;
			}
			int minPoint = alicePoint > bobPoint ? alicePoint : bobPoint;
			int maxHeightPoint=alicePoint;
			int maxHeight = heights[alicePoint];
			int minHeight=heights[bobPoint];
			if(heights[alicePoint] < heights[bobPoint])
			{
				maxHeightPoint=bobPoint;
				maxHeight=heights[bobPoint];
				minHeight=heights[alicePoint];
			}
			if(maxHeightPoint>=minPoint && maxHeight!=minHeight)
			{
				answer[i]=maxHeightPoint;
				continue;
			}
			for(int j=minPoint;j<heights.length;j++)
			{
				if(heights[j]>maxHeight && heights[j]>minHeight)
				{
					answer[i]=j;
					break;
				}
			}
		}
		return answer;
	}

}
