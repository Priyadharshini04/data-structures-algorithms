package com.myjava.strivers.graph;

public class NumberofEnclaves_1020 {

	// TC: O(n*m)+O(n*m) SC: O(n*m)
	public static int numEnclaves(int[][] grid) {
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		for (int col = 0; col < grid[0].length; col++) {
			if (!visited[0][col] && grid[0][col] == 1) {
				dfs(grid, 0, col, visited);
			}
		}
		for (int col = 0; col < grid[0].length; col++) {
			if (!visited[grid.length - 1][col] && grid[grid.length - 1][col] == 1) {
				dfs(grid, grid.length - 1, col, visited);
			}
		}
		for (int row = 0; row < grid.length; row++) {
			if (!visited[row][0] && grid[row][0] == 1) {
				dfs(grid, row, 0, visited);
			}
		}
		for (int row = 0; row < grid.length; row++) {
			if (!visited[row][grid[0].length - 1] && grid[row][grid[0].length - 1] == 1) {
				dfs(grid, row, grid[0].length - 1, visited);
			}
		}
		int totalCount = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1 && !visited[i][j]) {
					totalCount++;
				}
			}
		}
		return totalCount;
	}

	private static void dfs(int[][] grid, int row, int col, boolean[][] visited) {
		if (visited[row][col])
			return;
		visited[row][col] = true;
		int up = row - 1;
		int down = row + 1;
		int left = col - 1;
		int right = col + 1;
		if (up >= 0 && !visited[up][col] && grid[up][col] == 1) {
			dfs(grid, up, col, visited);
		}
		if (down < grid.length && !visited[down][col] && grid[down][col] == 1) {
			dfs(grid, down, col, visited);
		}
		if (left >= 0 && !visited[row][left] && grid[row][left] == 1) {
			dfs(grid, row, left, visited);
		}
		if (right < grid[0].length && !visited[row][right] && grid[row][right] == 1) {
			dfs(grid, row, right, visited);
		}
	}

}
