package unit_05_arrays_and_matrices;

import java.util.Random;

public class SummingColumns {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		Random random = new Random();
		
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = random.nextInt((100 - 1) - 1) + 1;
			}
		}
		
		// The code above created a matrix (you have it in the source code
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		int sum = 0;
		for (int column = 0; column < matrix.length; column++) {
			for (int row = 0; row < matrix.length; row++) {
				sum += matrix[row][column];
			}
			
			System.out.println("The sum of column " + column + ": " + sum);
			sum = 0;
		}
	}
}