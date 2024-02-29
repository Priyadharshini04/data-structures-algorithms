package lld;

public class Main {
	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addItem("cheerios", 3); // 8.43
		cart.addItem("cornflakes", 2); // 2.52
		cart.addItem("cheerios", 4);
		double total = (8.43 * 7) + (2 * 2.52);
		System.out.println(total + (total * 12.5 / 100));
		System.out.println(cart.getTotalPrice());
	}
}
