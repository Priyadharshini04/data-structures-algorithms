package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubSequence {

	public static List<String> generateSubsequences(String string) {
		List<String> result = new ArrayList<String>();
		generateSubsequencesString(result, string, "", 0);
		return result;
	}

	public static void generateSubsequencesString(List<String> str, String s, String res, int i) {
		if (i == s.length()) {
			str.add(res);
			return;
		}
		generateSubsequencesString(str, s, res + s.charAt(i), i + 1);
		generateSubsequencesString(str, s, res, i + 1);
	}
}
