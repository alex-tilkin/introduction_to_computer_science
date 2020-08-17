package unit_13_recursions;

public class Factorial {

	public static void main(String[] args) {
		long result = factorial(21);
		
		System.out.println(result);
	}

	public static long factorial(long number) {
		if(number <= 1) {
			return 1;
		}
		
		long recursiveResult = factorial(number - 1);
		long result = recursiveResult * number;
		
		return result;
	}
}
