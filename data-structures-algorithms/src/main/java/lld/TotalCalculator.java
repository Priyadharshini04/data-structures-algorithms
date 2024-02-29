package lld;

import java.text.DecimalFormat;

public class TotalCalculator {

	public static double calculateTotal(Product product, int quantity) {
		ProductDetails productDetails = new ProductPriceDetails();
		ProductResponse productData = productDetails.getProductDetails(product);
		double total = productData.getPrice() * quantity;
		return total + TaxCalculator.getTaxableAmount(total);
	}

	public static double formatDecimal(Double value) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		return Double.parseDouble(decimalFormat.format(value));
	}

}
