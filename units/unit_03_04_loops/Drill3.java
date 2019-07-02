package unit_03_04_loops;

import java.util.Scanner;

public class Drill3 {

	public static void main(String[] args) {
		float unitprice = 0f;
		int quantity = 0;
		float revenue = 0f;
		float discountRate = 0f;
		float discountAmount = 0f;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter unit price:");
		unitprice = scanner.nextFloat();
		System.out.print("Enter quantity:");
		quantity = scanner.nextInt();
		scanner.close();
		
		if(quantity < 100){
			revenue = unitprice*quantity;
		}
		else if(quantity >= 100 && quantity <= 120){
			discountRate = (float)10/100;
			revenue = unitprice*quantity;
			discountAmount = revenue*discountRate;
			revenue -= discountAmount;
		}
		else if(quantity>120){
			discountRate = (float)15 / 100;
			revenue = unitprice * quantity;
			discountAmount = revenue * discountRate;
			revenue -= discountAmount;
		}

		System.out.println("The revenue from the sale is: " + revenue + "$");
		System.out.println("After the discount: " + discountAmount + "$(" + discountRate * 100 + "%)");
	}
}
