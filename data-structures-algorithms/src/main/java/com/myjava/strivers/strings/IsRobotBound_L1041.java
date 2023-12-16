package com.myjava.strivers.strings;

import java.util.HashSet;
import java.util.Objects;

// https://leetcode.com/problems/robot-bounded-in-circle/description/
public class IsRobotBound_L1041 {
	public static boolean isRobotBounded(String instructions) {
		int dir[][] = { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } };
		int i = 0;
		int x = 0;
		int y = 0;

		for (int s = 0; s < instructions.length(); s++) {
			if (instructions.charAt(s) == 'L') {
				i = (i + 1) % 4;
			} else if (instructions.charAt(s) == 'R') {
				i = (i + 3) % 4;
			} else {
				x = x + dir[i][0];
				y = y + dir[i][1];
			}
		}
		return x == 0 && y == 0 || i != 0;
	}

	// Not working for all the scenarios
	public static boolean isRobotBoundeds(String instructions) {
		if (instructions.length() == 1) {
			if (instructions.charAt(0) == 'G')
				return false;
			else
				return true;
		}
//		if (instructions.contains("L") && instructions.contains("R")) {
			String str = instructions + instructions + instructions + instructions;
			Walk walk = new Walk();
			HashSet<Walk> set = new HashSet<Walk>();
			set.add(walk);
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'G') {
					if (walk.degre == 0) {
						walk.y += 1;
					} else if (walk.degre % 180 == 0 || walk.degre % -180 == 0) {
						walk.y -= 1;
					} else if (walk.degre == -90) {
						walk.x -= 1;
					} else if (walk.degre == 90) {
						walk.x += 1;
					}
				} else if (str.charAt(i) == 'L') {
					walk.degre -= 90;
				} else if (str.charAt(i) == 'R') {
					walk.degre += 90;
				}
				if (walk.x == 0 && walk.y == 0) {
					return true;
				}
//				if (set.contains(walk)) {
//					return true;
//				}
				set.add(walk);
			}
			return false;
//		} else if (instructions.contains("L")) {
//			return true;
//		} else if (instructions.contains("R")) {
//			return true;
//		}
//		return false;
	}

}

class Walk {
	int x = 0;
	int y = 0;
	int degre = 0;

	@Override
	public int hashCode() {
		return Objects.hash(degre, x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Walk other = (Walk) obj;
		return (degre == other.degre || (degre == 0 && Math.abs(other.degre) == 180)
				|| (other.degre == 180 && Math.abs(degre) == 0)) && x == other.x && y == other.y;
	}

}