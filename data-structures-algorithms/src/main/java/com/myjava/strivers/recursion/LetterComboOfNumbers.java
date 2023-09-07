package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterComboOfNumbers {

	public static List<String> findCombos(String digits) {
		String[] strs = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		List<String> list = new ArrayList<String>();
		if(digits.isEmpty())
		{
			return list;
		}
		findCombos(strs, digits, 0, list, new StringBuilder());
		return list;
	}

	public static void findCombos(String[] str, String digits, int idx,List<String> list, StringBuilder curr) {
		if (idx == digits.length()) {
			list.add(curr.toString());
			return;
		}
		int len=digits.charAt(idx) - '0';
		for(int i=0;i<str[len].length();i++)
		{
			curr.append(str[len].charAt(i));
			findCombos(str, digits, idx + 1, list, curr);
			curr.deleteCharAt(curr.length()-1);
		}
	}

}
