package unit_6;

import java.util.Scanner;

public class Drill3PascalTriangle {

	public static void main(String[] args) {
		int exponent;
		Scanner scanner = null;
		int[][] pascalTriangle = null;
		
		scanner = new Scanner(System.in);
		System.out.print("Provide the exponent of the Binomial: ");
		exponent = scanner.nextInt();
		scanner.close();
		
		pascalTriangle = createPascalTriangle(exponent);
		printPascalTriangle(pascalTriangle);
	}

	private static int[][] createPascalTriangle(int exponent) {
		int[][] pascalTriangle = new int[exponent + 1][exponent + 1];
		for(int row = 0; row <= exponent; row++) {
			pascalTriangle[row][0] = 1;
			for(int column = 1; column <= row; column++) {
				pascalTriangle[row][column] = pascalTriangle[row - 1][column - 1] + pascalTriangle[row - 1][column];   
			}
		}
		
		return pascalTriangle;
	}
	
	private static void printPascalTriangle(int[][] pascalTriangle){
		for(int row = 0; row < pascalTriangle.length; row++) {
			System.out.format("%" + (pascalTriangle.length - row) * 2 + "s", "");
			for(int column = 0; column <= row; column++) {
				System.out.format("%4d", pascalTriangle[row][column]);
			}
			System.out.println();
		}
	}
}