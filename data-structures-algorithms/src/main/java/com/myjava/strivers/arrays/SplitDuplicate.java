package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SplitDuplicate {

	public static List<List<Integer>> split(List<Integer> arr) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Map<Boolean, List<Integer>> resultMap = arr.stream()
				.collect(Collectors.partitioningBy(num -> arr.indexOf(num) != arr.lastIndexOf(num)));
		List<Integer> unique = resultMap.get(false);
		List<Integer> duplicates = resultMap.get(true).stream().distinct().sorted().collect(Collectors.toList());

		Collections.sort(duplicates);
		Collections.sort(unique);

		result.add(duplicates);
		result.add(unique);
		return result;
	}

}
