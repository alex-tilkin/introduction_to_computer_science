package unit_6;

public class ArraysAndMethods {

	public static void main(String[] args) {
		int number = 0;
		char[] vector = {'a', 'b'};
		
		System.out.println("Before methodOne number is " + number);
		methodOne(number);
		System.out.println("After methodOne number is " + number);
		
		System.out.println("Before methodTwo vector is ");
		printVector(vector);
		methodTwo(vector);
		System.out.println("After methodTwo vector is ");
		printVector(vector);
	}

	private static void methodOne(int number) {
		number = 1;
		System.out.println("In methodOne number is " + number);
	}
	
	private static void methodTwo(char[] vector) {
		vector[0] = '1';
		System.out.println("In methodTwo vector is ");
		printVector(vector);
	}
	
	private static void printVector(char[] vector) {
		for(int index = 0; index < vector.length; index++){
			System.out.print(vector[index]);
		}
		System.out.println("");
		
		return;
	}
}