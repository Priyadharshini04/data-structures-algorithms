package lld;

public class TaxCalculator {
	public static final double TAX_PERCENTAGE = 12.5;

	public static double getTaxableAmount(double total) {
		return total * TAX_PERCENTAGE / 100;
	}
}
