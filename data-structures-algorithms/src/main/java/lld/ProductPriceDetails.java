package lld;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.JSONObject;

public class ProductPriceDetails implements ProductDetails {
	private static final Logger LOGGER = Logger.getLogger(ProductPriceDetails.class.getName());

	ProductPriceDetails() {
	}

	@Override
	public ProductResponse getProductDetails(Product product) {
		HttpClient httpClient = HttpClient.newHttpClient();
		String apiUrl = "https://equalexperts.github.io/backend-take-home-test-data/" + product.getName() + ".json";
		URI uri = URI.create(apiUrl);
		HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();
		HttpResponse<String> response = null;
		try {
			response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			LOGGER.log(Level.SEVERE, " Error while fetching Product details", e);
		}
		JSONObject jsonObject = new JSONObject(response.body());
		ProductResponse productResponse = new ProductResponse(jsonObject.getDouble("price"),
				jsonObject.getString("title"));
		return productResponse;
	}
}
