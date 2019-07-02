package unit_13_recursions;

public class FibonacciSequence {

	public static void main(String[] args) {
		int result = fibonacciSequence(4);
		
		System.out.println(result);
	}

	private static int fibonacciSequence(int power) {
		if(power <= 1) {
			return 1;
		}
		
		return fibonacciSequence(power - 1) + fibonacciSequence(power - 2);
	}
	
	public int fibonacciIterative(int n) {
		if(n <= 1) {
			return n;
		}
		
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		
		return fib;
	}
}