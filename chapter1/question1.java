package chapter1;

import java.util.HashSet;
import java.util.Set;

public class question1 {

	/*
	 * Implement an algorithm to determine if a string has all unique characters.
	 * What if you can not use additional data structures?
	 */
	
	public static boolean isUniqueChars(String str) {
		Set<Character> hash = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {
			hash.add(new Character(str.charAt(i)));
		}

		if (hash.size() == str.length()) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(isUniqueChars("ABEFCGJA"));
	}

}
