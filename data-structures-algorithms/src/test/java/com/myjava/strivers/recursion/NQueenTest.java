package com.myjava.strivers.recursion;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NQueenTest {
	@Test
	public void test1()
	{
		List<List<String>> list1=Arrays.asList(Arrays.asList(".Q..","...Q","Q...","..Q."),Arrays.asList("..Q.","Q...","...Q",".Q.."));
		List<List<String>> list2=NQueen.solveNQueens(4);
		assertTrue(list1.size()==list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
	
	@Test
	public void test2()
	{
		boolean bol[][]= new boolean[][]{{true,true,true,true},{true,true,true,false},{false,true,false,true},{false,true,false,false}};
		boolean bol1[][]=new boolean[bol.length][bol.length];
		NQueen.fill(0,1,bol1);
		assertArrayEquals(bol, bol1);
	}
}
