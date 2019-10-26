package chapter1;

public class question6 {

	/*
	 * Given an image represented by an NxN matrix, where each pixel in the image is
	 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
	 * place?
	 */
	public static void rotateImage(int image[][]) {
		int matrix[][] = new int[image.length][image[0].length];
		int cont = image.length - 1;

		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image.length; j++) {
				matrix[j][cont] = image[i][j];
			}

			cont--;
		}

		printImage(matrix);
	}

	public static void printImage(int image[][]) {
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image[0].length; j++) {
				System.out.print(image[i][j] + " ");
			}

			System.out.println(" ");
		}

	}

	public static void main(String[] args) {
		int image[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };

		rotateImage(image);

	}

}
