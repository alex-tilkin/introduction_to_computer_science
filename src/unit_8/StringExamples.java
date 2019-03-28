package unit_8;

import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1 = 3;
		int x2 = 5;
		
		System.out.printf("(x1 = %d) == (x2 = %d) is %B\n", x1, x2, x1 == x2);
		
		x1 = 5;
		
		System.out.printf("(x1 = %d) == (x2 = %d) is %B\n", x1, x2, x1 == x2);
	}
}