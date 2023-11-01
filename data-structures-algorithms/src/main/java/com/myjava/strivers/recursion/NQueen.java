package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/n-queens/
public class NQueen {
	static int q=0;
	public static List<List<String>> solveNQueens(int n) {
		List<List<String>> list2 = new ArrayList<List<String>>();
		char[][] board=new char[n][n];
		for(int i=0;i<n;i++)
		{
			String str="";
			List<String> list1 = new ArrayList<String>();
			for(int j=0;j<n;j++)
			{
				solve(i, j, list1, list2, str, board, new char[n], 1);
				if(q==n-1)
				{
				list2.add(list1);
				}
				str+=".";
			}
		}
		return list2;
	}

	public static void solve(int row, int col, List<String> list1, List<List<String>> list2, String str,
			char[][] used, char[] ch, int idx) {
		if (idx == used.length*used.length) {
			return;
//			list2.add(new ArrayList<String>(list1));
		}
		if (row >= used.length || col >= used.length || (row == col && row == used.length) ) {
//			str=String.valueOf(ch);
//			str=str.replace(" ", ".");
//			list1.add(String.valueOf(ch));
			list1.add(str);
			return;
		}
		if (used[row][col]!='.') {
			used[row][col] = 'Q';
			++q;
			fill(row, col, used);
		} else {
			used[row][col] ='.';
		}
		solve(row, col + 1, list1, list2, str, used, ch, ++idx);
		solve(row+1, col, list1, list2, str, used, new char[used.length], ++idx);
	}
	public static void fill(int row, int col, char[][] used) {
		int i = 0, j = 0;
		while (i < used.length) {
			used[i][col] = '.';
			i++;
		}
		while (j < used.length) {
			used[row][j] = '.';
			j++;
		}
		i = row;
		j = col;
		while (i >= 0 && j < used.length) {
			used[i][j] = '.';
			i--;
			j++;
		}

		i = row;
		j = col;
		while (j >= 0 && i < used.length) {
			used[i][j] = '.';
			i++;
			j--;
		}

		i = row;
		j = col;
		while (j < used.length && i < used.length) {
			used[i][j] = '.';
			i++;
			j++;
		}
	}
	public static void fill(int row, int col, boolean[][] used) {
		int i = 0, j = 0;
		while (i < used.length) {
			used[i][col] = true;
			i++;
		}
		while (j < used.length) {
			used[row][j] = true;
			j++;
		}
		i = row;
		j = col;
		while (i >= 0 && j < used.length) {
			used[i][j] = true;
			i--;
			j++;
		}

		i = row;
		j = col;
		while (j >= 0 && i < used.length) {
			used[i][j] = true;
			i++;
			j--;
		}

		i = row;
		j = col;
		while (j < used.length && i < used.length) {
			used[i][j] = true;
			i++;
			j++;
		}
	}

}
