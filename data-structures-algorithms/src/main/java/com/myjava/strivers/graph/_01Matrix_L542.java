package com.myjava.strivers.graph;

import java.util.ArrayDeque;
import java.util.Queue;

// https://leetcode.com/problems/01-matrix/description/
public class _01Matrix_L542 {

	// reduces the time complexity but still it's in high time complexity.
	public static int[][] updateMatrix(int[][] mat) {
		MatPair[][] pairsArr = new MatPair[mat.length][mat[0].length];
		Queue<MatPair> queue = new ArrayDeque<MatPair>();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				MatPair pair = new MatPair(i, j, 0, false);
				if (mat[i][j] == 0) {
					pair.visited = true;
					queue.offer(pair);
				}
				pairsArr[i][j] = pair;
			}
		}
		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size-- > 0) {
				MatPair pair = queue.poll();
				pairsArr[pair.row][pair.col].visited = true;
				int up = pair.row - 1;
				int down = pair.row + 1;
				int right = pair.col + 1;
				int left = pair.col - 1;
				int level = pair.distance + 1;
				if (up >= 0) {
					if (!pairsArr[up][pair.col].visited) {// || pairsArr[up][pair.col].distance > level) {
						pairsArr[up][pair.col].distance = level;
						pairsArr[up][pair.col].visited = true;
						mat[up][pair.col] = level;
						queue.offer(pairsArr[up][pair.col]);
					}
				}
				if (down < mat.length) {
					if (!pairsArr[down][pair.col].visited) {// || pairsArr[down][pair.col].distance > level) {
						pairsArr[down][pair.col].distance = level;
						pairsArr[down][pair.col].visited = true;
						queue.offer(pairsArr[down][pair.col]);
						mat[down][pair.col] = level;
					}
				}
				if (right < mat[pair.row].length) {
					if (!pairsArr[pair.row][right].visited) { // || pairsArr[pair.row][right].distance > level) {
						pairsArr[pair.row][right].distance = level;
						pairsArr[pair.row][right].visited = true;
						queue.offer(pairsArr[pair.row][right]);
						mat[pair.row][right] = level;
					}
				}
				if (left >= 0) {
					if (!pairsArr[pair.row][left].visited) { // || pairsArr[pair.row][left].distance > level) {
						pairsArr[pair.row][left].distance = level;
						pairsArr[pair.row][left].visited = true;
						queue.offer(pairsArr[pair.row][left]);
						mat[pair.row][left] = level;
					}
				}
			}
		}
		return mat;
	}

	// Brute force works fine. TLE.
	public static int[][] updateMatrixs(int[][] mat) {
		int[][] result = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 0) {
					result[i][j] = 0;
				} else {
					int up = i - 1;
					int down = i + 1;
					int right = j + 1;
					int left = j - 1;
					if ((up >= 0 && mat[up][j] == 0) || (down < mat.length && mat[down][j] == 0)
							|| (left >= 0 && mat[i][left] == 0) || (right < mat[i].length && mat[i][right] == 0)) {
						result[i][j] = 1;
					} else {
						Queue<MatPair> queue = new ArrayDeque<MatPair>();
						boolean[][] visited = new boolean[mat.length][mat[i].length];
						queue.offer(new MatPair(i, j));

						int level = 0;
						boolean found = false;
						while (!queue.isEmpty() && !found) {
							int size = queue.size();
							while (size-- > 0) {
								MatPair tempPair = queue.poll();
								visited[tempPair.row][tempPair.col] = true;
								if (mat[tempPair.row][tempPair.col] == 0) {
									result[i][j] = level;
									found = true;
									break;
								}
								up = tempPair.row - 1;
								down = tempPair.row + 1;
								right = tempPair.col + 1;
								left = tempPair.col - 1;
								if (up >= 0 && !visited[up][tempPair.col])
									queue.offer(new MatPair(up, tempPair.col));
								if (down < mat.length && !visited[down][tempPair.col])
									queue.offer(new MatPair(down, tempPair.col));
								if (right < mat[tempPair.row].length && !visited[tempPair.row][right])
									queue.offer(new MatPair(tempPair.row, right));
								if (left >= 0 && !visited[tempPair.row][left])
									queue.offer(new MatPair(tempPair.row, left));

							}
							++level;
						}
					}
				}
			}
		}
		return result;
	}

}

class MatPair {
	int row;
	int col;
	int distance;
	boolean visited;

	public MatPair(int row, int col) {
		super();
		this.row = row;
		this.col = col;
	}

	public MatPair(int row, int col, int distance) {
		super();
		this.row = row;
		this.col = col;
		this.distance = distance;
	}

	public MatPair(int row, int col, int distance, boolean visited) {
		super();
		this.row = row;
		this.col = col;
		this.distance = distance;
		this.visited = visited;
	}
}