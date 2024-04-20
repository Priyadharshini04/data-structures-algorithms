package com.myjava;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyMains {
	public static void main(String[] args) {
		// String s = "<<^<v>>";
		String s = "><><";
		Character lastCh = '0';
		Queue<Character> queue = new ArrayDeque<Character>();
		for (int i = 0; i < s.length(); i++) {
			queue.offer(s.charAt(i));
		}
		int count = 0;
		// v-118 ,
		while (!queue.isEmpty()) {
			char poll = queue.poll();
			if (!queue.isEmpty()) {
				if (lastCh == '0') {
					if (isPossible(poll, queue.peek())) {
						++count;
					}
				} else {
					if (isPossible(lastCh, poll, queue.peek())) {
						++count;
					}
				}

			} else {
				if (poll == '>' || isPossible(lastCh, poll))
					++count;
			}
			lastCh = poll;
		}
		System.out.println("Count" + count);
		int number = 3298;
		while (isConsecutive(++number)) {

		}
		System.out.println(number);

		char[] chars = String.valueOf(3298).toCharArray();
		int length = chars.length;

		for (int i = length - 1; i > 0; i--) {
			char ch = chars[i];
			if (chars[i] - '0' + 1 <= 9 && chars[i] + 1 == chars[i - 1]) {
				chars[i]++;
				for (int j = i; j < length; j++) {
					chars[j] = '1';
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (char ch : chars) {
			sb.append(ch);
		}
		System.out.println(Integer.parseInt(String.valueOf(sb)));

		int[] A = new int[] { 1, 1, 3, 4, 4 };
		HashMap<Integer, Integer> map = new HashMap<>();
		PriorityQueue<MyPairs> pq = new PriorityQueue<>((a, b) -> {
			if (a.count == b.count)
				return a.a - b.a;
			return b.count - a.count;
		});
		int minOperations = A.length;
		for (int num : A) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
			pq.add(new MyPairs(pair.getKey(), pair.getValue()));
		}
		while (!pq.isEmpty()) {
			MyPairs p = pq.poll();
			if (p.count > p.a) {
				minOperations -= Math.abs(p.count - p.a);
			} else {
				minOperations -= Math.abs(p.a - p.count);
			}
			if(minOperations==Math.abs(p.a - p.count)) break;
		}

		System.out.println(minOperations);
	}

	private static boolean isConsecutive(int number) {
		String s = String.valueOf(number);
		for (int i = s.length() - 1; i > 0; i--) {
			if (s.charAt(i) == s.charAt(i - 1))
				return true;
		}
		return false;
	}

	public static boolean isPossible(char ch1, char ch2) {
		if ((ch1 == '^' && ch2 == 'v') || (ch1 == 'v' && ch2 == '^'))
			return true;
		if ((ch1 == '<' && ch2 == '>'))
			return true;
		if (ch1 == '<' && ch2 == '<')
			return true;
		if ((ch1 == '^' && (ch2 == '<' || ch2 == '>')) || (ch1 == 'v' && (ch2 == '<' || ch2 == '>')))
			return true;
		if ((ch2 == '^' && (ch1 == '<' || ch1 == '>')) || (ch2 == 'v' && (ch1 == '<' || ch1 == '>')))
			return true;
		return false;
	}

	public static boolean isPossible(char ch1, char ch2, char ch3) {
		if (isPossible(ch1, ch2) && isPossible(ch2, ch3))
			return true;
		return false;
	}
}

class MyPairs {
	public MyPairs(Integer a, Integer count) {
		this.a = a;
		this.count = count;
	}

	int a;
	int count;
}