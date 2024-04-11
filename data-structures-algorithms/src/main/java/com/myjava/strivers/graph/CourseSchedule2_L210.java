package com.myjava.strivers.graph;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule2_L210 {

	public static int[] findOrder(int numCourses, int[][] prerequisites) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < numCourses; i++) {
			list.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < prerequisites.length; i++) {
			list.get(prerequisites[i][0]).add(prerequisites[i][1]);
		}
		boolean visited[] = new boolean[numCourses];
		boolean pathVisited[] = new boolean[numCourses];

		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (!visited[i]) {
				boolean isCycle = dfsCylce(list, visited, result, i, pathVisited);
				if (isCycle)
					return new int[0];
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

	private static boolean dfsCylce(List<List<Integer>> list, boolean[] visited, List<Integer> result, int i,
			boolean[] pathVisited) {
		if (!visited[i]) {
			visited[i] = true;
			for (int j = 0; j < list.get(i).size(); j++) {
				int vertex = list.get(i).get(j);
				if (!visited[vertex]) {
					if (dfsCylce(list, visited, result, i, pathVisited))
						return true;
				} else if (pathVisited[vertex])
					return true;
			}
			result.add(i);
		}
		return false;

	}

}
