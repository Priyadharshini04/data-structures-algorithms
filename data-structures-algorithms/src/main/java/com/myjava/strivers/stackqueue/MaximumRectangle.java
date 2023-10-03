package com.myjava.strivers.stackqueue;

import java.util.Stack;

// https://leetcode.com/problems/maximal-rectangle/
public class MaximumRectangle {

	public static int maximalRectangle(char[][] matrix) {
		int maxArea=0;
		int heights[]=new int[matrix[0].length];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(matrix[i][j]=='0')
				{
					heights[j]=0;
				}
				else {
					heights[j]+=1;
				}
			}
			int area=largestArea(heights);
			maxArea=Math.max(maxArea, area);
		}
		return maxArea;
	}
	public static int largestArea(int[] heights)
	{
		int maxArea=0;
		Stack<Integer> stk=new Stack<Integer>();
		int n=heights.length;
		for(int i=0;i<=n;i++)
		{
			while(!stk.isEmpty() && (i==n || heights[stk.peek()]>heights[i]))
			{
				int mid=stk.pop();
				int width=stk.isEmpty()?i:(i-stk.peek()-1);
				maxArea=Math.max(maxArea, heights[mid]*width);
			}
			stk.push(i);
		}
		return maxArea;
	}
}
