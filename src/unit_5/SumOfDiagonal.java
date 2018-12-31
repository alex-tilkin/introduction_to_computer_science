package unit_5;

import java.util.Random;

public class SumOfDiagonal {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		Random random = new Random();
		
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = random.nextInt((100 - 1) - 1) + 1;
			}
		}
		
		int sumOfDiagonal = 0;
		for (int index = 0; index < matrix.length; index++) {
			sumOfDiagonal += matrix[index][index];
		}
		
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("The sum of the diagonal is: " + sumOfDiagonal);
	}
}