package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/spiral-matrix/
public class ArraySpriral {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        int i=0;
        int j=0;
        int k=1;
        int m=matrix.length-1;
        int n=matrix[0].length;
        int right=n;
        int down=0;
        int left=0;
        int up=0;
        while(k<=(matrix.length)*(matrix[0].length))
        {
    		list.add(matrix[i][j]);        	
        	if(k<right)
        	{
        		j++;
        	}
        	else if(k==right)
        	{
        		down=right+m;
        		m--;
        		i++;
        	}
        	else if(k<down)
        	{
        		i++;
        	}
        	else if(k==down)
        	{
        		n--;
        		left=down+n;
        		j--;
        	}
        	else if(k<left)
        	{
        		j--;
        	}
        	else if(k==left)
        	{
        		up=left+m;
        		i--;
        		m--;
        	}
        	else if(k<up)
        	{
        		i--;
        	}
        	else if(k==up)
        	{
        		n--;
        		right=up+n;
        		j++;
        	}
        	k++;
        }
        return list;
    }
    public static List<Integer> spiral(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        int right=0;
        int down=matrix.length-1;
        int left=matrix[0].length-1;
        int up=0;
        while(true)
        {
        	for(int i=up;i<=down;i++) {
        		list.add(matrix[right][i]);
        	}
        	right++;
        	if(right>left || up>down)
        	{
        		break;
        	}
        	for(int i=right;i<=left;i++)
        	{
        		list.add(matrix[i][down]);
        	}
        	down--;
        	if(right>left || up>down)
        	{
        		break;
        	}
        	for(int i=down;i>=up;i--)
        	{
        		list.add(matrix[left][i]);
        	}
        	left--;
        	if(right>left || up>down)
        	{
        		break;
        	}
        	for(int i=left;i>=right;i--)
        	{
        		list.add(matrix[i][up]);
        	}
        	up++;
        	if(right>left || up>down)
        	{
        		break;
        	}
        }
        return list;
    }
}
