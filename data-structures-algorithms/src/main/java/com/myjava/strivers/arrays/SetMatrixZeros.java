package com.myjava.strivers.arrays;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SetMatrixZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] matrix=new int[][] {{1,1,1},{1,0,1},{1,1,1}};
//		setZeroes(matrix);
		int[][] matrix1=new int[][] {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
		setZeroes(matrix1);
		print(matrix1);
		
	}
    public static void setZeroes(int[][] matrix) {
    	Set<Integer> rowMap=new TreeSet<Integer>();
    	Set<Integer> columnMap=new TreeSet<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[0].length;j++)
        	{
        		if(matrix[i][j]==0)
        		{
        			rowMap.add(i);
        			columnMap.add(j);
        		}
        	}
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
        		if(rowMap.contains(i) || columnMap.contains(j))
        		{
        			matrix[i][j]=0;
        		}
        	}
        }
    }
    public static void setZeroess(int[][] matrix) {
    	int[] row=new int[matrix.length];
    	int[] col=new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[0].length;j++)
        	{
        		if(matrix[i][j]==0)
        		{
        			row[i]=1;
        			col[j]=1;
        		}
        	}
        }
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[0].length;j++)
        	{
        		if(row[i]==1 || col[j]==1)
        		{
        			matrix[i][j]=0;
        		}
        	}
        }
    }
    public static void print(int[][] matrix)
    {
		for(int i=0;i<matrix.length;i++)
        {
        	for(int j=0;j<matrix[0].length;j++)
        	{
        		System.out.print(matrix[i][j]+",");
        	}
        	System.out.println();
        }
    }
}
