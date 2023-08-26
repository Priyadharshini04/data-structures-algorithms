package com.myjava.strivers.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeListTest {
	@Test
	public void test1()
	{
		Node head=ArrayToLinkedList.conLL(new int[] {1,2,3,4,5});
		assertFalse(PalindromeList.isPlaindrome(head));
	}
	
	@Test
	public void test2()
	{
		Node head=ArrayToLinkedList.conLL(new int[] {1,2,3,2,1});
		assertTrue(PalindromeList.isPlaindrome(head));
	}
	
	@Test
	public void test3()
	{
		Node head=ArrayToLinkedList.conLL(new int[] {1,2,2,1});
		assertTrue(PalindromeList.isPlaindrome(head));
	}
	
	@Test
	public void test4()
	{
		Node head=ArrayToLinkedList.conLL(new int[] {1,2,1});
		assertTrue(PalindromeList.isPlaindrome(head));
	}
}
