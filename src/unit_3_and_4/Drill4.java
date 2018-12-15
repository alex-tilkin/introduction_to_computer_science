package unit_3_and_4;

import java.util.Scanner;

public class Drill4 {

	public static void main(String[] args) {
		Scanner scanner = null;
		int baseWidth = 0;
		int stars = 0;
		int spaces = 0;
		
		System.out.println("Enter triangel's base width:");
		scanner = new Scanner(System.in);
		baseWidth = scanner.nextInt();
		scanner.close();
		stars = baseWidth;
		
		for(int index = 0; index < baseWidth; index++){
			for(int indexB = 0; indexB < spaces; indexB++){
				System.out.print(' ');
			}
			
			for(int indexB = 0; indexB < stars; indexB++){
				System.out.print('*');
			}
			
			System.out.print('\n');
			stars--;
			spaces++;
		}
	}
}
