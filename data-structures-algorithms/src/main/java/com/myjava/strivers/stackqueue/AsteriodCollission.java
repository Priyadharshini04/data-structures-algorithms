package com.myjava.strivers.stackqueue;

import java.util.LinkedList;
import java.util.Stack;

// https://leetcode.com/problems/asteroid-collision/description/
public class AsteriodCollission {
	public static int[] asteroidCollision(int[] asteroids) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i:asteroids)
		{
			while(!list.isEmpty() && list.getLast()>0 && list.getLast()<-i )
			{
				list.pollLast();
			}
			// list.getLast() < 0 condition : since asteroids is traveling the left and new asteroids with positive values are traveling to right
			if(list.isEmpty() || i>0 || list.getLast()<0)
			{
				list.add(i);
			}
			else if(i<0 && list.getLast()==-i)
			{
				list.pollLast();
			}
		}
		return list.stream().mapToInt(i->i).toArray();
	}
	public static int[] asteroidCollisions(int[] asteroids) {
		Stack<Integer> stk = new Stack<Integer>();
		for (int i = 0; i < asteroids.length; i++) {
			if (!stk.isEmpty() && ((asteroids[i] < 0 && (stk.peek() > 0)))) {
				boolean selfExplode = true;
				while (!stk.isEmpty()) {
					if (asteroids[i] < 0 && stk.peek()>0) {
						if (stk.peek() < (asteroids[i] * -1)) {
							selfExplode = false;
							stk.pop();
						} else {
							if (stk.peek() == (asteroids[i] * -1)) {
								stk.pop();
							}
							selfExplode = true;
							break;
						}
					} else if (asteroids[i] > 0 && stk.peek()<0) {
						if ((stk.peek() * -1) < (asteroids[i])) {
							selfExplode = false;
							stk.pop();
						} else {
							if ((stk.peek() * -1) == (asteroids[i])) {
								stk.pop();
							}
							selfExplode = true;
							break;
						}
					}
					else {
						break;
					}
				}
				if (!selfExplode) {
					stk.push(asteroids[i]);
				}
			} else {
				stk.push(asteroids[i]);
			}
		}
		int[] arr = new int[stk.size()];
		int i = 0;
		for (Integer val : stk) {
			arr[i] = val;
			i++;
		}
		return arr.length == 0 ? new int[] {} : arr;
	}

}
