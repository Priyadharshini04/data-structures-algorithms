package com.myjava.strivers.strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SortDateString {

	public static String[] sort(String[] str) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
		Date[] dates = new Date[str.length];
		for (int i = 0; i < str.length; i++) {
			try {
				dates[i] = dateFormat.parse(str[i]);
			} catch (ParseException e) {
				System.out.println("Error parsing date: " + e.getMessage());
			}
		}
		Arrays.sort(dates);
		int i = 0;
		for (Date date : dates) {
			str[i++] = dateFormat.format(date);
		}
		return str;
	}
}
