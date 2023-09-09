package com.myjava.strivers.recursion;

//https://leetcode.com/problems/word-search/
public class WordSearch {

	public static boolean searchWord(char[][] board, String word) {
		
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[0].length;j++)
			{
				boolean[][] used = new boolean[board.length][board[0].length];
				if(board[i][j]==word.charAt(0) && searchWord(board, word, i, j, 0, used))
				{
					return true;
				}
			}
		}
		return false;
	}

	public static boolean searchWord(char[][] board, String word, int row, int column, int idx,
			boolean[][] used) {
		if (idx == word.length()) return true;
		if (row >= board.length || row < 0 || column >= board[0].length || column < 0
				|| board[row][column] != word.charAt(idx) || used[row][column]) {
			return false;
		}

		if (board[row][column] == word.charAt(idx) && !used[row][column]) {
			used[row][column] = true;
		}
		boolean isFound = searchWord(board, word, row, column+1, idx + 1, used)
				|| searchWord(board, word, row, column-1,idx + 1, used)
				|| searchWord(board, word, row+1, column, idx + 1, used)
				|| searchWord(board, word, row-1, column, idx + 1, used);		
		used[row][column]=false;
		return isFound;
	}
}
