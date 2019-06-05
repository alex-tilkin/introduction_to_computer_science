package unit_05_arrays_and_matrices;

import java.util.Scanner;


public class Drill3 {

	public static void main(String[] args) {
		final int NUMBER_OF_ELEMENTS = 2;
		int[] vectorA = new int[NUMBER_OF_ELEMENTS];
		int[] vectorB = new int[NUMBER_OF_ELEMENTS];
		Scanner scanner = null;

		scanner = new Scanner(System.in);
		System.out.println("vectorA:");
		for(int index = 0; index < NUMBER_OF_ELEMENTS; index++){
			System.out.println("Enter a number into index " + index + ":");
			vectorA[index] = scanner.nextInt();
		}
		System.out.println("vectorB:");
		for(int index = 0; index < NUMBER_OF_ELEMENTS; index++){
			System.out.println("Enter a number into index " + index + ":");
			vectorB[index] = scanner.nextInt();
		}
		scanner.close();

		int index = 0;
		for(; index < NUMBER_OF_ELEMENTS; index++){
			int token = vectorA[index];
			int sumA = 0;
			while(token != 0){
				sumA += token % 10;
				token /= 10;
			}
			token = vectorB[index];
			int sumB = 0;
			while(token != 0){
				sumB += token % 10;
				token /= 10;
			}
			if(sumA != sumB){
				break;
			}
		}

		System.out.printf("Vectors do%s stand the requirement", index < NUMBER_OF_ELEMENTS ? " not" : "");
	}
}