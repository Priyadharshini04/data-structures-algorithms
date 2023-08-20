package com.myjava.strivers.arrays;

public class RotateImageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		print(matrix);
	}
    public static void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
        	int a=0;
        	int b=matrix.length-1;
        	while(a<=b)
        	{
            	int temp=matrix[a][i];
        		matrix[a][i]=matrix[b][i];
        		matrix[b][i]=temp;
        		a++;
        		b--;
        	}
        }
        for(int i=0;i<matrix.length;i++)
        {
        	for(int j=i+1;j<matrix.length;j++)
        	{
        		int temp=matrix[i][j];
        		matrix[i][j]=matrix[j][i];
        		matrix[j][i]=temp;
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
