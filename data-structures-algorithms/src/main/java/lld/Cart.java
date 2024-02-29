package lld;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Cart {
	private Map<Product, Integer> cartItems;

	Cart() {
		cartItems = new HashMap<>();
	}

	public void addItem(String productName, int quantity) {
		if (quantity > 0) {
			Product product = new Product(productName);
			cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
		}
	}

	public double getTotalPrice() {
		Optional<Double> totalCartPrice = cartItems.entrySet().stream()
				.map(i -> TotalCalculator.calculateTotal(i.getKey(), i.getValue())).reduce(Double::sum);
		return totalCartPrice.isPresent() ? TotalCalculator.formatDecimal(totalCartPrice.get()) : 0.0;
	}

}
