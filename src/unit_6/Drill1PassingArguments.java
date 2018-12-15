package unit_6;

public class Drill1PassingArguments {

	public static void main(String[] args) {
		int number = 1;
		char character = 'a';
		char[] vector = {'V', 'e', 'c', 't', 'o', 'r'};
		char[][] matrix = {{'1', '2', '3'}, {'4', '5', '6'}};
		
		methodOne();
		methodTwo(number);
		methodThree(number, character);
		methodFour(number, character, vector);
		methodFive(number, character, vector, matrix);
	}

	private static void methodOne() {
		System.out.println("In method methodOne");
	}
	
	private static void methodTwo(int number) {
		System.out.println("In method methodTwo");
		System.out.println("Arguments:");
		System.out.println("number: " + number);
	}
	
	private static void methodThree(int number, char character) {
		System.out.println("In method methodThree");
		System.out.println("Arguments:");
		System.out.println("number: " + number);
		System.out.println("character: " + character);
	}
	
	private static void methodFour(int number, char character, char[] vector) {
		System.out.println("In method methodFour");
		System.out.println("Arguments:");
		System.out.println("number: " + number);
		System.out.println("character: " + character);
		System.out.print("vector: ");
		for(int index = 0; index < vector.length; index++){
			System.out.print(vector[index]);
		}
		System.out.println("");
	}
	
	private static void methodFive(int number, char character, char[] vector, char[][] matrix) {
		System.out.println("In method methodFive");
		System.out.println("Arguments:");
		System.out.println("number: " + number);
		System.out.println("character: " + character);
		System.out.print("vector: ");
		for(int index = 0; index < vector.length; index++){
			System.out.print(vector[index]);
		}
		System.out.println();
		for (int row = 0; row < matrix.length; row++){
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.printf("%4c", matrix[row][col]);
			}
			System.out.println();
		}
	}
}