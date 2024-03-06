package com.myjava.strivers.graph;

//https://leetcode.com/problems/surrounded-regions/
public class SurrondedRegions_L130 {
	public static void solve(char[][] board) {
		boolean[][] visited = new boolean[board.length][board[0].length];
		for (int col = 0; col < board[0].length; col++) {
			if (board[0][col] == 'O' && !visited[0][col]) {
				dfs(board, 0, col, visited);
			}
		}
		for (int col = 0; col < board[0].length; col++) {
			if (board[board.length - 1][col] == 'O' && !visited[board.length - 1][col]) {
				dfs(board, board.length - 1, col, visited);
			}
		}
		for (int row = 0; row < board.length; row++) {
			if (board[row][0] == 'O' && !visited[row][0]) {
				dfs(board, row, 0, visited);
			}
		}
		for (int row = 0; row < board.length; row++) {
			if (board[row][board[0].length - 1] == 'O' && !visited[row][board[0].length - 1]) {
				dfs(board, row, board[0].length - 1, visited);
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 'O' && !visited[i][j]) {
					board[i][j] = 'X';
				}
			}
		}
	}

	private static void dfs(char[][] board, int row, int col, boolean[][] visited) {
		if(visited[row][col]) return;
		visited[row][col] = true;
		int up = row - 1;
		int down = row + 1;
		int right = col + 1;
		int left = col - 1;
		if (up >= 0 && board[up][col] == 'O' && !visited[up][col]) {
			dfs(board, up, col, visited);
		}
		if (down < board.length && board[down][col] == 'O' && !visited[down][col]) {
			dfs(board, down, col, visited);
		}
		if (right < board[0].length && board[row][right] == 'O' && !visited[row][right]) {
			dfs(board, row, right, visited);
		}
		if (left >= 0 && board[row][left] == 'O' && !visited[row][left]) {
			dfs(board, row, left, visited);
		}
	}
}
