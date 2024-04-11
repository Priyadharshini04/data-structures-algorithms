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
	public static void main(String[] args) throws Exception {
		System.out.println(new Result().getDiscountedPrice(1));
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

	public static int getDiscountedPrice(int barcode)  {
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
