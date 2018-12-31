package unit_5;

import java.util.Random;

public class SnakeFormInsertion {

	public static void main(String[] args) {
		int[][] matrix = new int[8][5];
		int value = 1;

		for (int row = 0 ; row < matrix.length ; row++) {
			if (row % 2 == 0){
				for (int column = 0 ; column < matrix[row].length; column++){
					matrix[row][column] = value++;   
				}
			}
			else{
				for (int column = matrix[row].length - 1 ; column >= 0 ; column--){
					matrix[row][column] = value++;
				}
			}
		}

		for (int row = 0; row < matrix.length; row++)  {
			for (int column = 0 ; column < matrix[row].length; column++){
				System.out.printf("%4d", matrix[row][column]);
			}

			System.out.println();
		}
	}
}