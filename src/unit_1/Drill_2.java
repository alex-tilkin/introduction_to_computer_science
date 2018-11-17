package unit_1;

import java.util.Scanner;

public class Drill_2 {

	public static void main(String[] args) {
		char firstChar;
		char secondChar;
		char thirdChar;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first char in the range of 0-9:");
		firstChar = scanner.next().charAt(0);
		
		System.out.println("Enter the second char in the range of 0-9:");
		secondChar = scanner.next().charAt(0);
		
		System.out.println("Enter the third char in the range of 0-9:");
		thirdChar = scanner.next().charAt(0);
		
		scanner.close();
		
		int firstInt = firstChar -'0';
		int secondInt = secondChar -'0';
		int thirdInt = thirdChar -'0';
		
		System.out.println("The first int is " + firstInt);
		System.out.println("The second int is " + secondInt);
		System.out.println("The third int is " + thirdInt);
	}
}