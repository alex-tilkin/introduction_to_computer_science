package unit_5;

import java.util.Random;

public class SettingAndPrintingMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[3][4];
		Random random = new Random();
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = random.nextInt((100 - 1) - 1) + 1;
			}
		}
		
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + "\t");
			}
			
			System.out.println();
		}
	}
}