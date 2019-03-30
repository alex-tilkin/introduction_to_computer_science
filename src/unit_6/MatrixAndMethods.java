package unit_6;

import java.util.Random;

public class MatrixAndMethods {

	public static void main(String[] args) {
		final int WIDTH = 4;
		final int LENGTH = 5;
		int[][] matrix = new int[WIDTH][LENGTH];
		
		System.out.println("Before filling the matrix:");
		printMatrix(matrix);
		fillMatrix(matrix);
		System.out.println("After filling the matrix:");
		printMatrix(matrix);
	}

	private static void printMatrix(int[][] matrix) {
		for (int indexA = 0; indexA < matrix.length; indexA++) {
			for (int indexB = 0; indexB < matrix.length; indexB++) {
				System.out.print(matrix[indexA][indexB] + "\t");
			}
			
			System.out.println();
		}
		System.out.println();
	}

	private static void fillMatrix(int[][] matrix) {
		Random random = new Random();
		
		for (int[] line : matrix) {
			for (int index = 0; index < line.length; index++) {
				line[index] = random.nextInt(20);
			}
		}
	}
}