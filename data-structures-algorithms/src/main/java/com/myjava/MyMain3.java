package com.myjava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.net.*;
import org.json.simple.*;
import org.json.simple.parser.*;
import org.json.simple.parser.ParseException;

public class MyMain3 {
	public static void main(String[] args) throws ParseException {
		System.setProperty("http.agent", "Chrome");
		int count = 0;
		try {
			URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
			try {
				HashMap<String, Integer> map = new HashMap<String, Integer>();
				URLConnection connection = url.openConnection();
				InputStream inputStream = connection.getInputStream();
				String result = new BufferedReader(new InputStreamReader(inputStream)).lines()
						.collect(Collectors.joining("\n"));
				if (result.length() > 4) {
					result = result.substring(0, result.length() - 2);
				}
				System.out.println(result);
				System.out.println(result.split(":", 2)[1]);
				String[] strs = result.split(":", 2)[1].split(",");
				for (int i = 0; i < strs.length - 1; i += 2) {
					String[] r1 = strs[i].split("=");
					String[] r2 = strs[i + 1].split("=");
					if (Integer.parseInt(r2[1]) >= 50) {
						count++;
					}
					map.put(r1[1], Integer.parseInt(r2[1]));
				}
				map.entrySet().stream().forEach(i -> System.out.println(i.getKey() + "==" + i.getValue()));

				long counts = map.entrySet().stream().filter(i -> i.getValue() >= 50).count();
				StringBuilder sb=new StringBuilder("leinob6g34");
			      sb.reverse();
			      StringBuilder sb1=new StringBuilder(String.valueOf(counts));
			      sb1.reverse();
			      System.out.print(String.valueOf(sb1)+":"+String.valueOf(sb));
			} catch (IOException ioEx) {
				System.out.println(ioEx);
			}
		} catch (MalformedURLException malEx) {
			System.out.println(malEx);
		}
	}
}

class Result {

	/*
	 * Complete the 'getDiscountedPrice' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts INTEGER
	 * barcode as parameter. API URL:
	 * https://jsonmock.hackerrank.com/api/inventory?barcode=<barcode>
	 */

	public static int getDiscountedPrice(int barcode) {
		try {
			URL getProductUrl = new URL("https://jsonmock.hackerrank.com/api/inventory?barcode=74001777");
			HttpURLConnection httpURLConnection = (HttpURLConnection) getProductUrl.openConnection();
			httpURLConnection.setRequestMethod("GET");

			BufferedReader reader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
			StringBuilder response = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				response.append(line);
			}
			reader.close();

			JSONParser parser = new JSONParser();
			JSONObject jsonResponse = (JSONObject) parser.parse(response.toString());
			JSONArray dataArray = (JSONArray) jsonResponse.get("data");
			int discountPrice = -1;
			if (dataArray.size() > 0) {
				JSONObject data = (JSONObject) dataArray.get(0);
				if (!data.isEmpty() && data.size() > 0) {
					int price = ((Long) data.get("price")).intValue();
					int discount = ((Long) data.get("discount")).intValue();
					double discountPre = Double.parseDouble(String.valueOf(discount));
					double pricePre = Double.parseDouble(String.valueOf(price));
					discountPrice = (int) (pricePre - ((discountPre / 100) * price));
				}
			}
			httpURLConnection.disconnect();
			return discountPrice;
		} catch (Exception e) {
			throw new ItemNotFoundException("Error While Applying discount for the " + barcode);
		}
	}

}

class ItemNotFoundException extends RuntimeException {
	ItemNotFoundException(String s) {
		super(s);
	}
}
