package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BuildingAliceBobMeetTest {
	@Test
	public void test1()
	{
		int heights[]=new int[] {6,4,8,5,2,7};
		int queirs[][]=new int[][] {{0,1},{0,3},{2,4},{3,4},{2,2}};
		int expected[]=new int[] {2,5,-1,5,2};
		assertArrayEquals(expected, BuildingAliceBobMeet.leftmostBuildingQueries(heights,queirs));
	}
	
	@Test
	public void test2()
	{
		int heights[]=new int[] {5,3,8,2,6,1,4,6};
		int queirs[][]=new int[][] {{0,7},{3,5},{5,2},{3,0},{1,6}};
		int expected[]=new int[] {7,6,-1,4,6};
		assertArrayEquals(expected, BuildingAliceBobMeet.leftmostBuildingQueries(heights,queirs));
	}
	
	@Test
	public void test3()
	{	
		int heights[]=new int[] {1,2,1,2,1,2};
		int queirs[][]=new int[][] {{0,0},{0,1},{0,2},{0,3},{0,4},{0,5},{1,0},{1,1},{1,2},{1,3},{1,4},{1,5},{2,0},{2,1},{2,2},{2,3},{2,4},{2,5},{3,0},{3,1},{3,2},{3,3},{3,4},{3,5},{4,0},{4,1},{4,2},{4,3},{4,4},{4,5},{5,0},{5,1},{5,2},{5,3},{5,4},{5,5}};
		int expected[]=new int[] {0,1,3,3,5,5,1,1,-1,-1,-1,-1,3,-1,2,3,5,5,3,-1,3,3,-1,-1,5,-1,5,-1,4,5,5,-1,5,-1,5,5};
		assertArrayEquals(expected, BuildingAliceBobMeet.leftmostBuildingQueries(heights,queirs));
	}
}
