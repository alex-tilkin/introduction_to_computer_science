package unit_05_arrays_and_matrices;

import java.util.Scanner;


public class Drill4 {

	public static void main(String[] args) {
		final int 	ROWS 			= 5;
		final int 	COLUMNS 		= 5;
		int 		maximum 		= -1;
		int 		maximumColumn 	= -1;
		Scanner 	scanner 		= null;
		char 		inputChar;

		int[] 	accumulationsVector = new int[COLUMNS];
		char 	matrix[][] = {	{'r', 'c', 'd', 'i', 'm'}, 
				{'q', 't', '4', 'p', ']'}, 
				{'a', 'o', 'q', '0', '2'}, 
				{'c', 'h', 'q', '4', 'p'}, 
				{'z', 'c', 'r', 'i', 'l'}};

		scanner 	= new Scanner(System.in);
		System.out.print("Provide a character: ");
		inputChar 	= scanner.next().charAt(0);
		scanner.close();

		for(int column = 0; column < COLUMNS; column++){
			for(int row = 0; row < ROWS; row++){
				if(inputChar == matrix[row][column]){
					accumulationsVector[column]++;
				}
			}
		}

		for(int index = 1; index < accumulationsVector.length; index++){
			if(accumulationsVector[index] > maximum && accumulationsVector[index] > 0){
				maximum = accumulationsVector[index];
				maximumColumn = index;
			}
		}

		if(maximumColumn > -1){
			System.out.println("The character " + inputChar + " appears the most in column " + (maximumColumn + 1));
		}
		else{
			System.out.println("The character " + inputChar + " does not exists in the matrix");
		}
	}
}