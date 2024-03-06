package com.myjava.strivers.graph;

import org.junit.Test;

public class SurrondedRegions_L130Test {
	@Test
	public void test1() {
		char[][] board = new char[][] { { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'O', 'X' }, { 'X', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'X' } };
		SurrondedRegions_L130.solve(board);
	}

	@Test
	public void test2() {
		char[][] board = new char[][] { { 'O', 'O', 'O' }, { 'O', 'O', 'O' }, { 'O', 'O', 'O' } };
		SurrondedRegions_L130.solve(board);
	}

	@Test
	public void test3() {
		char[][] board = new char[][] { { 'X', 'O', 'X', 'X' }, { 'O', 'X', 'O', 'X' }, { 'X', 'O', 'X', 'O' },
				{ 'O', 'X', 'O', 'X' } };
		SurrondedRegions_L130.solve(board);
	}
}
