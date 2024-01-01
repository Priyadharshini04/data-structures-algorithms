package com.myjava.strivers.heaps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;

// https://leetcode.com/problems/design-twitter/
public class DesignTwitter_L355 {

	Map<Integer, User> map = new TreeMap<Integer, User>();
	static int timeStamp = 0;

	class User {
		int user_id;
		// Use set instead of list to avoid duplicate id's.
		Set<User> followees;
		Tweet tweet_head;

		public User(int user_id) {
			super();
			this.user_id = user_id;
		}

		public User(int user_id, Tweet tweet_head) {
			super();
			this.user_id = user_id;
			this.tweet_head = tweet_head;
		}

	}

	class Tweet {
		// Dont' think to control based on tweet id. timeStamp is the better approach.
		int tweet_id;
		int time;
		Tweet next;

		Tweet(int tweet_id) {
			this.tweet_id = tweet_id;
			timeStamp += 1;
			time = timeStamp;
		}
	}

	public void postTweet(int userId, int tweetId) {
		Tweet tweet = new Tweet(tweetId);
		follow(userId, userId);
		if (map.containsKey(userId)) {
			User user = map.get(userId);
			if (user.tweet_head == null) {
				user.tweet_head = tweet;
			} else {
				tweet.next = user.tweet_head;
				user.tweet_head = tweet;
			}
		}
	}

	public List<Integer> getNewsFeed(int user_id) {
		List<Integer> result = new ArrayList<Integer>();
		if (map.containsKey(user_id)) {
			Set<User> set = map.get(user_id).followees;
			PriorityQueue<Tweet> pq = new PriorityQueue<Tweet>((a, b) -> b.time - a.time);
			for (User user : set) {
				if (user.tweet_head != null) {
					pq.offer(user.tweet_head);
				}
			}
			int i = 0;
			while (!pq.isEmpty() && i < 10) {
				Tweet tweet = pq.poll();
				result.add(tweet.tweet_id);
				if (tweet.next != null) {
					pq.offer(tweet.next);
				}
				i++;
			}
		}

		return result;

	}

	public void follow(int followerId, int followeeId) {
		User followerUser = null;
		User followeeUser = null;
		if (map.containsKey(followerId)) {
			followerUser = map.get(followerId);
		} else {
			followerUser = new User(followerId);
			map.put(followerId, followerUser);
		}
		if (map.containsKey(followeeId)) {
			followeeUser = map.get(followeeId);
		} else {
			followeeUser = new User(followeeId);
			map.put(followeeId, followeeUser);
		}
		if (followerUser.followees == null) {
			followerUser.followees = new HashSet<User>();
		}
		followerUser.followees.add(followeeUser);
	}

	public void unfollow(int followerId, int followeeId) {
		if (map.containsKey(followerId)) {
			User followerUser = map.get(followerId);
			if (followerUser.followees != null)
				if (map.containsKey(followeeId))
					followerUser.followees.remove(map.get(followeeId));
		}
	}

}
