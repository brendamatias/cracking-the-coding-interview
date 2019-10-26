package chapter1;

import java.util.HashSet;
import java.util.Set;

public class question2 {
	/*
	 * Write code to reverse a C-Style String. (C-String means that “abcd” is
	 * represented as five characters, including the null character.)
	 */

	public static String reverseString(String str) {
		char[] myChar = str.toCharArray();

		System.out.println(str);
		
		int p1 = 0;
		int p2 = myChar.length - 1;

		while (p1 < p2) {
			char temp = myChar[p1];
			myChar[p1] = myChar[p2];
			myChar[p2] = temp;

			p1++;
			p2--;
		}

		str = String.copyValueOf(myChar);

		return str;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("abcd "));
		
	}
}
