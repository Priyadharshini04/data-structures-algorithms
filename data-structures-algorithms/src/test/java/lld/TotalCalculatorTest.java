package lld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ ProductPriceDetails.class, ProductDetails.class })
public class TotalCalculatorTest {

	@Test
	public void testCalculateTotal() throws Exception {

		double productPrice = 10.0;

		ProductResponse productResponse = new ProductResponse(productPrice, "Test Product");

		Product testProduct = new Product("test_product");
		int quantity = 2;

		ProductPriceDetails productDetails = PowerMockito.mock(ProductPriceDetails.class);
		PowerMockito.whenNew(ProductPriceDetails.class).withNoArguments().thenReturn(productDetails);

		PowerMockito.when(productDetails.getProductDetails(testProduct)).thenReturn(productResponse);

		double actualTotal = TotalCalculator.calculateTotal(testProduct, quantity);

		double expectedTotal = productPrice * quantity;

		assertEquals(expectedTotal, actualTotal, 0.01);
	}

	@Test
	public void testFormatDecimal() {
		double value = 123.456789;
		double expectedFormattedValue = 123.46; // Rounded to two decimal places

		double actualFormattedValue = TotalCalculator.formatDecimal(value);

		// Asserting that the actual formatted value matches the expected value
		assertEquals(expectedFormattedValue, actualFormattedValue, 0.01); // Specify a delta for floating-point
																			// comparison
	}
}
