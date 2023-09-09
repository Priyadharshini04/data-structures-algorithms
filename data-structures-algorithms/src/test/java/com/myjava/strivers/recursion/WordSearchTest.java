package com.myjava.strivers.recursion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordSearchTest {
	@Test
	public void test1() {
		char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		assertTrue(WordSearch.searchWord(board, "ABCCED"));
	}

	@Test
	public void test2() {
		char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		assertTrue(WordSearch.searchWord(board, "SEE"));
	}

	@Test
	public void test3() {
		char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		assertFalse(WordSearch.searchWord(board, "ABCB"));
	}

	@Test
	public void test4() {
		char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		assertTrue(WordSearch.searchWord(board, "EES"));
	}
	
	@Test
	public void test5() {
		char[][] board = new char[][] { { 'C', 'A', 'A' }, { 'A', 'A', 'A'}, { 'B', 'C', 'D'} };
		assertTrue(WordSearch.searchWord(board, "AAB"));
	}
	@Test
	public void test6() {
		char[][] board = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'E', 'S' }, { 'A', 'D', 'E', 'E' } };
		assertTrue(WordSearch.searchWord(board, "ABCESEEEFS"));
	}
}
