package lld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TaxCalculatorTest {

	@Test
	public void validateGetTaxableAmount() {
		double total = 100.0;
		double expectedTaxableAmount = 100.0 * TaxCalculator.TAX_PERCENTAGE / 100;

		double actualTaxableAmount = TaxCalculator.getTaxableAmount(total);

		assertEquals(expectedTaxableAmount, actualTaxableAmount, 0.01);
	}
}
