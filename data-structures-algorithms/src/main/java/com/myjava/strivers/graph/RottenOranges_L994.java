package com.myjava.strivers.graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottenOranges_L994 {

	public static int orangesRotting(int[][] grid) {
		int milliSeconds = 0;
		Queue<Oranges> queue = new ArrayDeque<Oranges>();
		boolean[][] visited = new boolean[grid.length][];
		for (int i = 0; i < grid.length; i++) {
			visited[i] = new boolean[grid[i].length];
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 2) {
					queue.add(new Oranges(i, j, 0));
				}
			}
		}
		while (!queue.isEmpty()) {
			Oranges org = queue.poll();
			if (!visited[org.row][org.col]) {
				visited[org.row][org.col] = true;
				if (milliSeconds < org.level) {
					milliSeconds = org.level;
				}
				int up = org.row - 1;
				int right = org.col + 1;
				int left = org.col - 1;
				int down = org.row + 1;
				if (up >= 0 && !visited[up][org.col] && grid[up][org.col] == 1) {
					grid[up][org.col] = 2;
					queue.add(new Oranges(up, org.col, org.level + 1));
				}
				if (right < grid[org.row].length && !visited[org.row][right] && grid[org.row][right] == 1) {
					grid[org.row][right] = 2;
					queue.add(new Oranges(org.row, right, org.level + 1));
				}
				if (left >= 0 && !visited[org.row][left] && grid[org.row][left] == 1) {
					grid[org.row][left] = 2;
					queue.add(new Oranges(org.row, left, org.level + 1));
				}
				if (down < grid.length && !visited[down][org.col] && grid[down][org.col] == 1) {
					grid[down][org.col] = 2;
					queue.add(new Oranges(down, org.col, org.level + 1));
				}
			}
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					return -1;
				}
			}
		}

		return milliSeconds;
	}

}

class Oranges {
	int row;
	int col;
	int level;

	public Oranges(int row, int col, int level) {
		super();
		this.row = row;
		this.col = col;
		this.level = level;
	}

}