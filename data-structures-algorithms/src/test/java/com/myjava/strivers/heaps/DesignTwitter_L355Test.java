package com.myjava.strivers.heaps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DesignTwitter_L355Test {
	@Test
	public void test1() {
		DesignTwitter_L355 dt = new DesignTwitter_L355();
		dt.postTweet(1, 5);
		List<Integer> top10NewsFeed = dt.getNewsFeed(1);
		List<Integer> expectedFeed = Arrays.asList(5);
		assertList(expectedFeed, top10NewsFeed);
		dt.follow(1, 2);
		dt.postTweet(2, 4);
		top10NewsFeed = dt.getNewsFeed(1);
		expectedFeed = Arrays.asList(4, 5);
		assertList(expectedFeed, top10NewsFeed);
		dt.unfollow(1, 2);
		top10NewsFeed = dt.getNewsFeed(1);
		expectedFeed = Arrays.asList(5);
		assertList(expectedFeed, top10NewsFeed);
	}

	public void assertList(List<Integer> expected, List<Integer> actual) {
		assertTrue(expected.size() == actual.size());
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}
}
