package unit_2;

import java.util.Scanner;

public class IntRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int result = scanner.nextInt();
		scanner.close();
		if (result > 0) {
			System.out.println("The integer " + result + " is positive");
		}
		if (result < 0) {
			System.out.println("The integer " + result + " is negative");
		}
		if (result == 0) {
			System.out.println("The integer " + result + " not positive nor negative");
		}
	}
}
