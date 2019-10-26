package chapter1;

public class question7 {
	/*
	 * Write an algorithm such that if an element in an MxN matrix is 0, its entire
	 * row and column is set to 0.
	 */
	
	public static void setZeros(int matrix[][]) {
		int cont = matrix[0].length;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					for (int c = 0; c < cont; c++) {
						matrix[i][c] = 0;
					}
				}
			}
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
		int matrix[][] = { { 1, 2, 1, 1 }, { 0, 2, 2, 2 }, { 3, 3, 3, 3 }, { 0, 4, 4, 4 } };
		
		setZeros(matrix);

	}

}
