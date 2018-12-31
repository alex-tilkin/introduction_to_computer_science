package unit_5;

import java.util.Random;

public class CreateRandomJaggedMatrix {

	public static void main(String[] args) {
		final int numOfRows = 4;
		int[][] matrix = new int[numOfRows][];
		Random random = new Random();
		
		for (int index = 0; index < matrix.length; index++) {
			matrix[index] = new int[random.nextInt((5 - 1) - 1) + 1];
		}
		
		for (int rows = 0; rows < matrix.length; rows++) {
			for (int column = 0; column < matrix[rows].length; column++) {
				System.out.print(matrix[rows][column] + "\t");
			}
			
			System.out.println();
		}
	}
}