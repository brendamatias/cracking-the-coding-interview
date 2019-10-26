package chapter1;

public class question8 {

	/*
	 * Assume you have a method isSubstring which checks if one word is a substring
	 * of another. Given two strings, s1 and s2, write code to check if s2 is a
	 * rotation of s1 using only one call to isSubstring (i.e., �waterbottle� is a
	 * rotation of �erbottlewat�).
	 */
	public static boolean isSubstring(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		String duplicate = s1 + s1;
		return duplicate.contains(s2);
	}

	public static void main(String[] args) {

		System.out.println(isSubstring("apple", "pleap"));

	}

}
