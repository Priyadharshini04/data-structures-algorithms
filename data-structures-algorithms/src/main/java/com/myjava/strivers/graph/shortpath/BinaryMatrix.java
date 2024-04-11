package com.myjava.strivers.graph.shortpath;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryMatrix {

	public static int shortestPathBinaryMatrix(int[][] grid) {
		if (grid[0][0] == 1 || grid[grid.length - 1][grid.length - 1] == 1)
			return -1;
		Pair p = new Pair(0, 0, 1);
		Queue<Pair> queue = new ArrayDeque<>();
		queue.offer(p);
//		int distance[][] = new int[grid.length][grid[0].length];
//		for (int i = 0; i < distance.length; i++) {
//			for (int j = 0; j < distance.length; j++) {
//				distance[i][j] = -1;
//			}
//		}
		while (!queue.isEmpty()) {
			p = queue.poll();
			if (grid[p.row][p.col] == 0) {
				if (p.row == grid.length - 1 && p.col == grid[0].length - 1) {
					return p.distance;
				}
				grid[p.row][p.col] = 1;
				// distance[p.row][p.col] = p.distance;
				int up = p.row - 1;
				int down = p.row + 1;
				int left = p.col - 1;
				int right = p.col + 1;
				int currDistance = p.distance + 1;
				if (up >= 0 && grid[up][p.col] == 0) {// && (distance[up][p.col] == -1 || distance[up][p.col] >
														// currDistance)) {
					queue.offer(new Pair(up, p.col, currDistance));
				}
				if (down < grid.length && grid[down][p.col] == 0) {
					// && (distance[down][p.col] == -1 || distance[down][p.col] > currDistance)) {
					queue.offer(new Pair(down, p.col, currDistance));
				}
				if (left >= 0 && grid[p.row][left] == 0) {
					// && (distance[p.row][left] == -1 || distance[p.row][left] > currDistance)) {
					queue.offer(new Pair(p.row, left, currDistance));
				}
				if (right < grid[0].length && grid[p.row][right] == 0) {
					// && (distance[p.row][right] == -1 || distance[p.row][right] > currDistance)) {
					queue.offer(new Pair(p.row, right, currDistance));
				}
				if (up >= 0 && left >= 0 && grid[up][left] == 0) {
					// && (distance[up][left] == -1 || distance[up][left] > currDistance)) {
					queue.offer(new Pair(up, left, currDistance));
				}
				if (down < grid.length && left >= 0 && grid[down][left] == 0) {
					// && (distance[down][left] == -1 || distance[down][left] > currDistance)) {
					queue.offer(new Pair(down, left, currDistance));
				}
				if (up >= 0 && right < grid[0].length && grid[up][right] == 0) {
					// && (distance[up][right] == -1 || distance[up][right] > currDistance)) {
					queue.offer(new Pair(up, right, currDistance));
				}
				if (down < grid.length && right < grid[0].length && grid[down][right] == 0) {
					// && (distance[down][right] == -1 || distance[down][right] > currDistance)) {
					queue.offer(new Pair(down, right, currDistance));
				}
			}

		}
		return -1;
	}

}

class Pair {
	int row;
	int col;
	int distance;

	public Pair(int row, int col, int distance) {
		super();
		this.row = row;
		this.col = col;
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Pair(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

}