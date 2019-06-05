package unit_05_arrays_and_matrices;

import java.util.Scanner;


public class Drill1 {

	public static void main(String[] args) {
		final int NUMBER_OF_ELEMENTS = 10;
		int minimum = Integer.MAX_VALUE;
		int minimumCounter = 0;
		int[] vector = new int[NUMBER_OF_ELEMENTS]; //new int[]{7, 5, 12, 53, 64, 23, 4, 5, 7, 10};
		Scanner scanner = null;

		scanner = new Scanner(System.in);
		for(int index = 0; index < NUMBER_OF_ELEMENTS; index++){
			System.out.println("Enter a number into index " + index + ":");
			vector[index] = scanner.nextInt();
		}
		scanner.close();

		// Looking for the minimum value in the array
		minimum = vector[0];
		for(int index = 1; index < NUMBER_OF_ELEMENTS; index++){
			if(vector[index] <= minimum){
				minimum = vector[index];
			}
		}

		// Printing the indexes that contain the minimum value
		for(int index = 0; index < NUMBER_OF_ELEMENTS; index++){
			if(vector[index] == minimum){
				System.out.print(vector[index] + " ");
				minimumCounter++;
			}
		}
		System.out.println("\n" + minimumCounter + " index(es) contain(s) the number " + minimum);
	}
}