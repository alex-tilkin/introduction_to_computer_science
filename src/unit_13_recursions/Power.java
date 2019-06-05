package unit_13_recursions;

public class Power {

	public static void main(String[] args) {
		int result = power(2, 3);
		
		System.out.println(result);
	}

	private static int power(int base, int power) {
		if(power == 0) {
			return 1;
		}
		
		return power(base, power - 1) * base;
	}
}