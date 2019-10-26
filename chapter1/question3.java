package chapter1;

import java.util.Arrays;

public class question3 {

	/*
	 * Design an algorithm and write code to remove the duplicate characters in a
	 * string without using any additional buffer. NOTE: One or two additional
	 * variables are fine. An extra copy of the array is not. FOLLOW UP Write the
	 * test cases for this method
	 */

	public static String removeDuplicate(char[] str) {
		int index = 0;

		for (int i = 0; i < str.length; i++) {
			int j;
			
			for (j = 0; j < i; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}

			if (j == i) {
				str[index++] = str[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str, index));
	}


	public static void main(String[] args) {
		char[] letras = new char[3];
		letras[0] = 'S';
		letras[1] = 'T';
		letras[2] = 'T';

		System.out.println(removeDuplicate(letras));
	}

}
