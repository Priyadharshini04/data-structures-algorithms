package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySpriral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
	}
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
}
