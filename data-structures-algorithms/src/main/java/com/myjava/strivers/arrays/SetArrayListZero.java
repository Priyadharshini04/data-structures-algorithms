package com.myjava.strivers.arrays;

import java.util.ArrayList;

public class SetArrayListZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
		int[] row=new int[matrix.size()];
		int[] col=new int[matrix.get(0).size()];
		for(int i=0;i<matrix.size();i++)
        {
        	for(int j=0;j<matrix.get(0).size();j++)
        	{
        		if(matrix.get(i).get(j)==0)
        		{
        			row[i]=1;
        			col[j]=1;
        		}
        	}
        }
        for(int i=0;i<matrix.size();i++)
        {
        	for(int j=0;j<matrix.get(0).size();j++)
        	{
        		if(row[i]==1 || col[j]==1)
        		{
        			matrix.get(i).set(j, 0);
        		}
        	}
        }
		return matrix;
    }
	public static void print(ArrayList<ArrayList<Integer>> matrix)
    {
		for(int i=0;i<matrix.size();i++)
        {
        	for(int j=0;j<matrix.get(0).size();j++)
        	{
        		System.out.print(matrix.get(i).get(j)+",");
        	}
        	System.out.println();
        }
    }
}
