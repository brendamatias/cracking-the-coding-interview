package chapter1;

public class question5 {

	/*
	 * Write a method to replace all spaces in a string with ‘%20’.
	 */
	public static String replaceSpace(String str) {
	    String[] tempString = str.split(" ");
	    StringBuilder sentence = new StringBuilder(tempString[0]);

	    for (int i = 1; i < tempString.length; ++i) {
	        sentence.append("%20");
	        sentence.append(tempString[i]);
	    }

	    return sentence.toString();
	}

	public static void main(String[] args) {		
		System.out.println(replaceSpace("AB C GD G"));
	}

}
