package unit_06_methods;

public class Drill2ReturningValues {

	public static void main(String[] args) {
		int mainNumber;
		char mainCharacter;
		char[] mainVector = null;
		char[][] mainMatrix = null;
		
		methodOne();
		mainNumber = methodTwo();
		System.out.println("returnedValue: " + mainNumber);
		
		mainCharacter = methodThree();
		System.out.println("character: " + mainCharacter);
		
		mainVector = methodFour();
		printVector(mainVector);
		
		mainMatrix = methodFive();
		printMatrix(mainMatrix);
	}

	private static void methodOne() {
		System.out.println("In method methodOne");
		
		return;
	}
	
	private static int methodTwo() {
		System.out.println("In method methodTwo");
		
		return 10;
	}
	
	private static char methodThree() {
		System.out.println("In method methodThree");
		
		return 'c';
	}
	
	private static char[] methodFour() {
		char[] vector = new char[]{'n', 'e', 'w', ' ', 'V', 'c', 't', 'o', 'r'};
		
		return vector;
	}
	
	private static void printVector(char[] vector) {
		for(int index = 0; index < vector.length; index++){
			System.out.print(vector[index]);
		}
		System.out.println("");
		
		return;
	}
	
	private static char[][] methodFive() {
		char[][] matrix = {{'1', '2', '3'}, {'4', '5', '6'}};
		
		return matrix;
	}
	
	private static void printMatrix(char[][] matrix) {
		for (int row = 0; row < matrix.length; row++){
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.printf("%4c", matrix[row][col]);
			}
			System.out.println();
		}
	}
}