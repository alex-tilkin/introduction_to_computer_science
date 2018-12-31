package unit_5;

import java.util.Scanner;


public class Drill2 {

	public static void main(String[] args) {
		final int NUMBER_OF_ELEMENTS = 5;
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
			if(vectorA[index] != vectorB[(NUMBER_OF_ELEMENTS - 1) - index]){
				break;
			}
		}

		System.out.printf("Vectors are%s opposite", index < NUMBER_OF_ELEMENTS ? " not" : "");
		//		if(index < NUMBER_OF_ELEMENTS){
		//			System.out.println("Vectors are not opposite");
		//		}
		//		else{
		//			System.out.println("Vectors are opposite");
		//		}
	}
}
