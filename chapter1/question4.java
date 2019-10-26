package chapter1;

import java.util.Arrays;

public class question4 {

	/*
	 * Write a method to decide if two strings are anagrams or not.
	 */

	public static boolean isAnagram(String strOne, String strTwo) {
		if (strOne.length() != strTwo.length()) {
			return false;
		}

		int size = strOne.length() - 1;

		String stringOneCharArray[] = strOne.split("");
		String stringTwoCharArray[] = strTwo.split("");

		for (int i = 0; i < strOne.length(); i++) {
			if (!stringOneCharArray[i].equals(stringTwoCharArray[size])) {
				return false;
			}

			size--;
		}

		return true;
	}

	public static boolean isAnagramWithSort(String a, String b) {
		char tempArrayA[] = a.toCharArray();
		char tempArrayB[] = b.toCharArray();

		Arrays.sort(tempArrayA);
		Arrays.sort(tempArrayB);

		return Arrays.equals(tempArrayA, tempArrayB);
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("keep", "peek"));
		System.out.println(isAnagram("keep", "pefk"));

		/*
		 * Can it be ordered?
		 */
		System.out.println(isAnagramWithSort("keep", "peek"));
		System.out.println(isAnagramWithSort("keep", "pefk"));

	}

}
