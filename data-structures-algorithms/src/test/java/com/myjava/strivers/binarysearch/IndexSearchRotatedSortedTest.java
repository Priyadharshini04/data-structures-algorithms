package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IndexSearchRotatedSortedTest {
    
    @Test
    public void test1() {
        assertEquals(5, IndexSearchRotatedSorted.searchIndex(new int[] {4,5,6,7,0,1,2}, 1));
    }
    @Test
    public void test2() {
        assertEquals(4, IndexSearchRotatedSorted.searchIndex(new int[] {4,5,6,7,0,1,2}, 0));
    }
    
    @Test
    public void test3() {
        assertEquals(1, IndexSearchRotatedSorted.searchIndex(new int[] {3,1}, 1));
    }
    @Test
    public void test4() {
        assertEquals(0, IndexSearchRotatedSorted.searchIndex(new int[] {4,5,6,7,0,1,2}, 4));
    }
    @Test
    public void test5() {
        assertEquals(1, IndexSearchRotatedSorted.searchIndex(new int[] {8,9,2,3,4}, 9));
    }
}
