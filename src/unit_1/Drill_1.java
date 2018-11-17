package unit_1;

import java.util.Calendar;
import java.util.Scanner;

public class Drill_1 {
	public static void main(String[] args) {
		int yearOfBirth;
		int id;
		int height;
		char gender;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your year of birth?");
		yearOfBirth = scanner.nextInt();
		
		System.out.println("What is your ID?");
		id = scanner.nextInt();
		
		System.out.println("What is your height?");
		height = scanner.nextInt();
		
		System.out.println("What is your gender? (m - male, f - female)");
		gender = scanner.next().charAt(0);
		
		scanner.close();
		
		int age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
		
		System.out.println("Your details are:");
		System.out.println("* Age " + age);
		System.out.println("* ID " + id);
		System.out.println("* Height " + height);
		System.out.println("* Gender " + gender);
	}
}