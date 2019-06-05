package unit_01_simple_building_blocks;

import java.util.Scanner;

public class ScanningIntoString {
	public static void main(String[] args) {
		String myString;
		Scanner scanner = new Scanner(System.in);

		myString = scanner.next();
		System.out.println("Scan that terminates on Space: " + myString);

		scanner.nextLine();
		myString = scanner.nextLine();
		System.out.println("Scan that ignores Spaces: " + myString);
	}
}