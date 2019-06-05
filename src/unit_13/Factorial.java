package unit_13;

public class Factorial {

	public static void main(String[] args) {
		int result = factorial(3);
		
		System.out.println(result);
	}

	public static int factorial(int number) {
		if(number <= 1) {
			return 1;
		}
		
		int recursiveResult = factorial(number - 1);
		int result = recursiveResult * number;
		
		return result;
	}
}
