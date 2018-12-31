package unit_5;

import java.util.Scanner;

public class Drill5 {

	public static void main(String[] args) {
		final int NUMBER_OF_COLUMNS = 4;
		final int NUMBER_OF_ROWS 	= 10;

		int[] 		vectorOfValues 	= {4, 2, 6, 5}; //new int[NUMBER_OF_COLUMNS];
		char[][] 	matrix 			= new char[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
		Scanner 	scanner 		= null;

		//scanner = new Scanner(System.in);
		//for(int index = 0; index < NUMBER_OF_COLUMNS; index++){
		//	System.out.print("Provide a value in the range [0, 10] for the index: " + index);
		//	vectorOfValues[index] = scanner.nextInt();
		//}
		//scanner.close();

		for(int row = 0; row < NUMBER_OF_ROWS; row++){
			for(int column = 0; column < NUMBER_OF_COLUMNS; column++){
				if(vectorOfValues[column] == NUMBER_OF_ROWS - row){
					matrix[row][column] = '*';
					vectorOfValues[column]--;
				}
				else{
					matrix[row][column] = ' ';
				}
				// matrix[row][column] = vectorOfValues[column] == NUMBER_OF_ROWS - row - 1 ? '*' : ' ';
			}
		}

		for(int row = 0; row < NUMBER_OF_ROWS; row++){
			for(int column = 0; column < NUMBER_OF_COLUMNS; column++){
				System.out.print(matrix[row][column] + " ");
			}
			System.out.print('\n');
		}
	}
}