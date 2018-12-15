package unit_3_and_4;

import java.util.Scanner;

public class DoWhileDrill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int result;

		do {
			System.out.println("What is the meaning of life?");
			System.out.println("1) Have fun");
			System.out.println("2) Achieve your goals");
			System.out.println("3) Leave me alone, I’m tired");
			result = scanner.nextInt();
	
			switch(result){
				case 1:{
					System.out.println("mmm..... maybe");
				}break;
				case 2:{
					System.out.println("Go get a treatment");
				}break;
				default:{
					System.out.println("I can realte, quiting...");
				}
			}
		}while(result != 3);

		scanner.close();
	}
}