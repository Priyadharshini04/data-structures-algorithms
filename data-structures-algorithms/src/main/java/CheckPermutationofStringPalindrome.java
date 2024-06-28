import java.util.HashSet;

public class CheckPermutationofStringPalindrome {
	public static void main(String[] args) {
		HashSet<Character> chars = new HashSet<>();
		String input = "abca";
		for (char ch : input.toCharArray()) {
			if (chars.contains(ch)) {
				chars.remove(ch);
			}
			chars.add(ch);
		}
		System.out.println(chars.size()<=1);
	}
}
