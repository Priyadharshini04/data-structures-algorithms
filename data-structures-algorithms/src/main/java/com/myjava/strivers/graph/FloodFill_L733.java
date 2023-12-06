package com.myjava.strivers.graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class FloodFill_L733 {

	public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
		boolean[][] visited = new boolean[image.length][image[0].length];
		Queue<Pair> queue = new ArrayDeque<Pair>();
		int initialColor = image[sr][sc];
		if (image[sr][sc] != color) {
			queue.offer(new Pair(sr, sc));
		}
		while (!queue.isEmpty()) {
			Pair pair = queue.poll();
			if (!visited[pair.row][pair.col]) {
				visited[pair.row][pair.col] = true;
				image[pair.row][pair.col] = color;
				int up = pair.row - 1;
				int down = pair.row + 1;
				int left = pair.col - 1;
				int right = pair.col + 1;
				if (up >= 0 && !visited[up][pair.col] && image[up][pair.col] != color
						&& image[up][pair.col] == initialColor) {
					queue.offer(new Pair(up, pair.col));
				}
				if (down < image.length && !visited[down][pair.col] && image[down][pair.col] != color
						&& image[down][pair.col] == initialColor) {
					queue.offer(new Pair(down, pair.col));
				}
				if (left >= 0 && !visited[pair.row][left] && image[pair.row][left] != color
						&& image[pair.row][left] == initialColor) {
					queue.offer(new Pair(pair.row, left));
				}
				if (right < image[pair.row].length && !visited[pair.row][right] && image[pair.row][right] != color
						&& image[pair.row][right] == initialColor) {
					queue.offer(new Pair(pair.row, right));
				}
			}
		}
		return image;
	}

}

class Pair {
	int row;
	int col;

	Pair(int row, int col) {
		this.row = row;
		this.col = col;
	}
}
